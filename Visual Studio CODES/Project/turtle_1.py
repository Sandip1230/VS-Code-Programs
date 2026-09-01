import turtle
import colorsys
t = turtle.Turtle()
s = turtle.Screen().bgcolor("black")
t.speed (100)
n = 70
h = 0
for i in range(360):
    c = colorsys.hsv_to_rgb(h,1,0.8)
    h+= 1/n
    t.color(c)
    t.left(1)
    t.fd(1)
    for j in range (1):
        t.left(2)
        t.circle(70)
        t.right(90)
        t.forward(100)
        t.circle(50)
        t.left(60)
        t.forward(10)
        t.circle(40)
        t.left(2)
        t.circle(70)
        t.right(90)
        t.forward(100)
        t.circle(50)
        t.left(60)
        t.forward(10)
        t.circle(40)