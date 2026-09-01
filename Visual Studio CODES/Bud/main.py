import sys
from PyQt6.QtWidgets import QApplication

from core.audio_wave import AudioStream
from core.commander import Commander
from core.memory import Memory
from core.speaker import Speaker
from ui.bud_window import BudWindow

def main():
    app = QApplication(sys.argv)

    audio = AudioStream()
    audio.start()

    commander = Commander()
    memory = Memory()
    speaker = Speaker()

    def handle(text):
        text = text.strip().lower()

        if text.startswith("remember"):
            try:
                k, v = text.replace("remember","").split(" as ")
                memory.remember(k.strip(), v.strip())
                response = "I will remember that, sir."
            except:
                response = "Please use remember something as value, sir."

        elif text.startswith("recall"):
            key = text.replace("recall","").strip()
            val = memory.recall(key)
            response = val if val else "I do not have that memory, sir."

        else:
            response = commander.execute(text)

        window.set_status(response)
        speaker.speak(response)

    window = BudWindow(audio, handle)
    window.show()
    window.set_status("Bud online, sir.")
    speaker.speak("Welcome Back Dark . Bud launched . All systems standby.")

    sys.exit(app.exec())

if __name__ == "__main__":
    main()
