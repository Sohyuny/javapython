import numpy as np
import tensorflow as tf
from tensorflow import keras
from sklearn.model_selection import train_test_split

(train_input, train_target),(test_input, test_target)=keras.datasets.fashion_mnist.load_data()

train_scaled=train_input.reshape(-1,784)/255
test_scaled=test_input.reshape(-1,784)/255

print(train_scaled.shape)
print(test_scaled.shape)

train_scaled,val_scaled,train_target,val_target=train_test_split(train_scaled,train_target,random_state=42)

print(train_scaled.shape)
print(val_scaled.shape)

dense=keras.layers.Dense(10, activation='softmax', input_shape=(784,))

model=keras.Sequential(dense)
model.compile(loss='sparse_categorical_crossentropy', metrics='accuracy')

model.fit(train_scaled, train_target, epochs=5)

훈련점수=model.evaluate(train_scaled, train_target)
print(훈련점수)

import ex03

wsg=ex03.wsg()/255.0
print(np.round(wsg,decimals=3))
pred=model.predict(wsg.reshape(-1,784))
print(pred)

print(np.argmax(pred))

import matplotlib.pyplot as plt

plt.imshow(wsg,cmap='gray_r')
plt.show()