import cv2
import numpy as np
img = cv2.imread('20220811/vanil.jpg',cv2.IMREAD_COLOR)

cv2.imread('img[:,:,0]', img[:,:,0])
cv2.waitKey(0)

img[:,:,2] = 0

cv2.imshow('vanil',img)
cv2.waitKey(0)

test = img[:,:,1:]==np.array([0])
print(test)