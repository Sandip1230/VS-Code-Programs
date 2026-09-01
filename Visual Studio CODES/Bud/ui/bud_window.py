from PyQt6.QtWidgets import QWidget, QVBoxLayout, QHBoxLayout, QLabel, QPushButton, QLineEdit
from PyQt6.QtGui import QPainter, QColor, QPen
from PyQt6.QtCore import QTimer
import math, time, numpy as np

class BudWindow(QWidget):
    def __init__(self, audio, command_handler):
        super().__init__()
        self.audio = audio
        self.command_handler = command_handler
        self.start = time.time()

        self.setWindowTitle("Bud")
        self.setGeometry(300, 200, 1000, 420)
        self.setStyleSheet("background:black;color:white")

        layout = QVBoxLayout(self)

        # Top bar
        bar = QHBoxLayout()
        bar.addWidget(QLabel("BUD"))
        close = QPushButton("X")
        close.clicked.connect(self.close)
        close.setStyleSheet("color:red;background:black;border:none")
        bar.addStretch()
        bar.addWidget(close)
        layout.addLayout(bar)

        self.status = QLabel("Listening, sir")
        layout.addWidget(self.status)

        layout.addStretch()

        self.input = QLineEdit()
        self.input.setPlaceholderText("Type command and press Enter...")
        self.input.returnPressed.connect(self.submit)
        layout.addWidget(self.input)

        self.timer = QTimer()
        self.timer.timeout.connect(self.update)
        self.timer.start(16)

    def submit(self):
        text = self.input.text()
        self.input.clear()
        self.command_handler(text)

    def set_status(self, text):
        self.status.setText(text)

    def paintEvent(self, e):
        p = QPainter(self)
        w = self.width()
        mid = 250
        bars = 80
        bw = w / bars
        data = self.audio.data
        t = time.time() - self.start

        p.setPen(QPen(QColor(0, 200, 255), 2))

        for i in range(bars):
            x = int(i * bw)
            if len(data) > 0:
                h = abs(data[int(i / bars * len(data))]) * 180
            else:
                h = (math.sin(t * 2 + i * .1) + 1) * 6
            p.drawLine(x, int(mid - h), x, int(mid + h))
