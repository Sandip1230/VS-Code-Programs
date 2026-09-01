from PyQt6.QtWidgets import QWidget
from PyQt6.QtGui import QPainter, QColor, QPen, QFont
from PyQt6.QtCore import QTimer, QPropertyAnimation, Qt
import numpy as np
import math
import time

class HUD(QWidget):
    def __init__(self, audio):
        super().__init__()

        self.audio = audio
        self.start_time = time.time()

        self.setWindowTitle("Bud HUD")
        self.setGeometry(400, 250, 900, 300)
        self.setWindowFlags(
            Qt.WindowType.FramelessWindowHint |
            Qt.WindowType.WindowStaysOnTopHint
        )
        self.setStyleSheet("background-color: black;")
        self.setWindowOpacity(0.0)

        self.status_text = "LISTENING"
        self.status_color = QColor(0, 255, 180)

        self.fade = QPropertyAnimation(self, b"windowOpacity")
        self.fade.setDuration(600)

        self.timer = QTimer()
        self.timer.timeout.connect(self.update)
        self.timer.start(16)

    def fade_in(self):
        self.show()
        self.fade.stop()
        self.fade.setStartValue(self.windowOpacity())
        self.fade.setEndValue(0.95)
        self.fade.start()

    def set_status(self, text, color):
        self.status_text = text
        self.status_color = color
        self.update()

    def paintEvent(self, event):
        painter = QPainter(self)
        painter.setRenderHint(QPainter.RenderHint.Antialiasing)

        w, h = self.width(), self.height()
        mid = h // 2

        data = self.audio.data
        energy = np.abs(data).mean() if len(data) else 0
        speaking = energy > 0.015

        bars = 90
        bar_w = w / bars
        t = time.time() - self.start_time

        painter.setPen(QPen(QColor(0, 180, 255), 2))

        for i in range(bars):
            x = int(i * bar_w)
            center_bias = 1 - abs(i - bars / 2) / (bars / 2)

            if speaking:
                idx = int(i / bars * len(data))
                amp = abs(data[idx]) if idx < len(data) else 0
                height = amp * h * 1.2
            else:
                pulse = math.sin(t * 2 + i * 0.15)
                height = (pulse + 1) * 6 * center_bias

            painter.drawLine(
                int(x), int(mid - height),
                int(x), int(mid + height)
            )

        painter.setPen(QPen(self.status_color, 1))
        painter.setFont(QFont("Consolas", 11))
        painter.drawText(20, 30, f"STATUS: {self.status_text}")

        painter.setPen(QPen(QColor(0, 120, 180), 1))
        painter.drawRect(5, 5, w - 10, h - 10)
