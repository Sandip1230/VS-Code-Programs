import sounddevice as sd
import numpy as np

class AudioStream:
    def __init__(self, samplerate=44100, blocksize=1024):
        self.data = np.zeros(blocksize)
        self.stream = sd.InputStream(
            channels=1,
            samplerate=samplerate,
            blocksize=blocksize,
            callback=self.callback
        )

    def callback(self, indata, frames, time, status):
        self.data = indata[:, 0]

    def start(self):
        self.stream.start()
