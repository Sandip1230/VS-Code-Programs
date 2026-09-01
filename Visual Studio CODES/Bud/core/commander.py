import subprocess
import os

class Commander:
    def execute(self, text):
        t = text.lower()

        if "open chrome" in t:
            subprocess.Popen("start chrome", shell=True)
            return "Chrome opened, sir."

        if "open explorer" in t:
            subprocess.Popen("explorer")
            return "Explorer opened, sir."

        if "shutdown" in t:
            os.system("shutdown /s /t 5")
            return "Shutting down, sir."

        return "Command not recognized, sir."
