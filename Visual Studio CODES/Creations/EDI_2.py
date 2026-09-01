import speech_recognition as sr
import pyttsx3
import webbrowser
import cv2
import face_recognition
import datetime
import requests
import tkinter as tk
from tkinter import messagebox

# Initialize the speech engine
engine = pyttsx3.init()

def speak(text):
    """This function allows Edy to speak out the given text."""
    engine.say(text)
    engine.runAndWait()

def listen():
    """This function listens to the user's voice command and returns it as text."""
    recognizer = sr.Recognizer()
    with sr.Microphone() as source:
        print("Listening...")
        recognizer.adjust_for_ambient_noise(source)
        audio = recognizer.listen(source)
        try:
            command = recognizer.recognize_google(audio)
            print(f"You said: {command}")
            return command.lower()
        except sr.UnknownValueError:
            speak("Sorry, I did not understand that.")
        except sr.RequestError:
            speak("Sorry, I am having trouble with the network.")
        return None

def open_website(command):
    """This function opens a website based on the user's voice command."""
    if "open" in command:
        if "google" in command:
            webbrowser.open("https://www.google.com")
            speak("Opening Google")
        elif "youtube" in command:
            webbrowser.open("https://www.youtube.com")
            speak("Opening YouTube")
        elif "facebook" in command:
            webbrowser.open("https://www.facebook.com")
            speak("Opening Facebook")
        else:
            speak("Sorry, I can only open Google, YouTube, or Facebook for now.")
    else:
        speak("Please specify a website to open.")

def tell_time():
    """This function tells the current time."""
    current_time = datetime.datetime.now().strftime("%I:%M %p")
    speak(f"The current time is {current_time}")

def get_weather():
    """This function retrieves the weather information using OpenWeatherMap API."""
    API_KEY = "your_openweathermap_api_key"  # Replace with your OpenWeatherMap API key
    city = "Kolkata"
    url = f"http://api.openweathermap.org/data/2.5/weather?q={city}&appid={API_KEY}&units=metric"
    
    try:
        response = requests.get(url)
        weather_data = response.json()
        if weather_data["cod"] == 200:
            weather_desc = weather_data["weather"][0]["description"]
            temp = weather_data["main"]["temp"]
            speak(f"The weather in {city} is {weather_desc} with a temperature of {temp} degrees Celsius.")
        else:
            speak("Sorry, I could not fetch the weather information.")
    except:
        speak("Sorry, I am having trouble accessing the weather service.")

def authenticate_user():
    """This function authenticates the user using face recognition."""
    video_capture = cv2.VideoCapture(0)

    # Load the known admin face image and encode it
    admin_image = face_recognition.load_image_file("admin.jpg")  # Replace with the path to your admin image
    admin_face_encoding = face_recognition.face_encodings(admin_image)[0]

    face_authenticated = False

    while True:
        # Capture a frame from the video feed
        ret, frame = video_capture.read()

        # Convert the frame from BGR (OpenCV format) to RGB (face_recognition format)
        rgb_frame = frame[:, :, ::-1]

        # Find all the faces in the current frame of video
        face_locations = face_recognition.face_locations(rgb_frame)
        face_encodings = face_recognition.face_encodings(rgb_frame, face_locations)

        for face_encoding in face_encodings:
            # Check if the face is a match for the known admin face
            matches = face_recognition.compare_faces([admin_face_encoding], face_encoding)

            if True in matches:
                face_authenticated = True
                break

        if face_authenticated:
            speak("Authentication successful. Welcome, Admin.")
            update_gui("Authentication successful. Welcome, Admin.")
            video_capture.release()
            cv2.destroyAllWindows()
            return True
        else:
            update_gui("Unauthorized access. Please try again.")
            if cv2.waitKey(1) & 0xFF == ord('q'):
                break

    video_capture.release()
    cv2.destroyAllWindows()
    return False

def update_gui(message):
    """Update the GUI with new text."""
    output_label.config(text=message)

def start_Edy():
    """This function starts the Edy assistant after authentication."""
    if authenticate_user():
        while True:
            command = listen()
            if command:
                if "exit" in command or "quit" in command:
                    speak("Goodbye!")
                    update_gui("Goodbye!")
                    break
                elif "open" in command:
                    open_website(command)
                elif "time" in command:
                    tell_time()
                elif "weather" in command:
                    get_weather()
                else:
                    speak("Sorry, I don't understand that command.")
                    update_gui("Unknown command.")

# GUI setup
root = tk.Tk()
root.title("Edy Assistant")
root.configure(bg="black")
root.geometry("600x400")

# Creating a hacker-like theme
output_label = tk.Label(root, text="Waiting for authentication...", fg="green", bg="black", font=("Courier", 14))
output_label.pack(pady=20)

start_button = tk.Button(root, text="Start Edy", fg="green", bg="black", command=start_Edy, font=("Courier", 14))
start_button.pack(pady=20)

# Start the GUI event loop
root.mainloop()