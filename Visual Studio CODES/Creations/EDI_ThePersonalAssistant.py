from lib2to3 import pygram
import speech_recognition as sr
import pyttsx3
import webbrowser

# Initialize the speech engine
engine = pyttsx3.init()

def speak(text):
    engine.say(text)
    engine.runAndWait()

def listen():
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
    # List of supported websites
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

def main():
    print("Hello, I am Edy . How can I assist you today ?")
    speak("Hello, I am Edy ; How can I assist you today ?")
    
    while True:
        command = listen()
        if command:
            if "exit" in command or "quit" in command:
                speak("Goodbye!")
                break
            elif "open" in command:
                open_website(command)
            else:
                speak("Sorry, I don't understand that command.")

if __name__ == "__main__":main()