import cv2

img = cv2.imread('20220811/balchang.jpg',cv2.IMREAD_COLOR)
print(img.shape)

for i in range(0,577,10):
    img[:,:i]=[255,255,0]
    cv2.imshow('balchang',img)
    a=cv2.waitKey(100)
    print(a)
cv2.imwrite('balchang_copy.jpg',img)

img = cv2.imread('20220811/balchang.jpg',cv2.IMREAD_COLOR)
img_gray = cv2.cvtColor(img,cv2.COLOR_BGR2GRAY)
print(img_gray.shape)
cv2.imshow('balchang',img_gray)
cv2.waitKey(0)
cv2.imwrite('balchang_copy.jpg',img_gray)
