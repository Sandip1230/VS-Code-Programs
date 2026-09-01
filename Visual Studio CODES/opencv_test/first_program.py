import cv2

img = cv2.imread(
    r"C:\Users\maitr\OneDrive\Desktop\Programs\C\C programs\C in VS Code\Number Logics\image.jpg"
)

if img is None:
    print("Image not found. Check path or filename.")
else:
    cv2.imshow("Image Window", img)
    cv2.waitKey(0)
    cv2.destroyAllWindows()

print(type(img))
