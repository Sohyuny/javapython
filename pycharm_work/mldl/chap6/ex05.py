import matplotlib.pyplot as plt
import numpy as np

plt.axis('off')
plt.imshow(fruits)

prevalue=km.predict()


a=cv2.imread('cvfruits0.jpg', cv2.IMREAD_GRAYSCALE)
print(a.shape)

pred=km.predict(a.reshape(-1,10000))
print(pred)

target=np.array(['사과']*100+['파인애플']*100+['바나나']*100)
print(target.shape)
print(target[:5])
print(target[100:105])
print(target[200:205])

lr=LogisticRegression()
lr.fit(fruits2d,target)

pred=lr.predict(fruits2d[0].reshape(-1,10000))
print(pred)
pred=lr.predict(fruits2d[100].reshape(-1,10000))
print(pred)
pred=lr.predict(fruits2d[200].reshape(-1,10000))
print(pred)

pred=lr.predict(a.reshape(-1,10000))
print(pred)
