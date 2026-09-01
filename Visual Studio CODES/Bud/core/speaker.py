import pyttsx3
import threading

class Speaker:
    def __init__(self):
        self.engine = pyttsx3.init()
        self.engine.setProperty("rate", 165)
        self.engine.setProperty("volume", 1.0)

        voices = self.engine.getProperty("voices")
        if voices:
            self.engine.setProperty("voice", voices[0].id)

    def speak(self, text):
        threading.Thread(target=self._say, args=(text,), daemon=True).start()

    def _say(self, text):
        self.engine.say(text)
        self.engine.runAndWait()
