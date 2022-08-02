import cv2
import numpy as np
import matplotlib.pyplot as plt

wyw = cv2.imread('wyw.jpg')
print(wyw.shape)
print(wyw[0,:])
# pltwyw = cv2.cvtColor(wyw, cv2.COLOR_BGR2RGB)
# np.save('a.npy',pltwyw)
# pltwyw = np.load('a.npy)

plt.scatter([10,20,30],[10,20,30], s=1000)
plt.text(100,200,'hihihi')
# plt.axis('off')
plt.imshow(pltwyw)
plt.show()