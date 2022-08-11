import cv2
import numpy as np

img = cv2.imread('20220811/vanil.jpg',cv2.IMREAD_COLOR)

cv2.imshow('vanil',img)
cv2.waitKey(0)

print(img.shape)
try:
    for i in range(100):
        x = np.random.randint(0,151,1)[0]
        endx = x+30
        y = np.random.randint(0,91,1)[0]
        endy = y+30

        print(x,' ',endx)
        print(y,' ',endy)

        roi = img[x:endx, y:endy]
        print(roi.shape)

        x = np.random.randint(0,151,1)[0]
        endx = x+100
        y = np.random.randint(0,91,1)[0]
        endy = y+100

        print(x,' ',endx)
        print(y,' ',endy)

        img[x:endx, y:endy] = roi
        
        cv2.imshow('vanil',img)
        cv2.waitKey(100)
except:
    pass