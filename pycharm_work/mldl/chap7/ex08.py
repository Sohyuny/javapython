import numpy as np

def model_fn(a_layer=None):
    model = keras.Sequential()
    model.add(keras.layers.Flatten(input_shape=(28,28)))
    model.add(keras.layers.Dense(100,activation='relu'))
    if a_layer:
        model.add(a_layer)
    model.add(keras.layers.Dense(10, activation='softmax'))
    return model
import cv2

gabang = cv2.imread('gabang.png',cv2.IMREAD_GRAYSCALE)

model = keras.models.load_model('model_whole.h5')
pred = model.predict(gabang.reshape(-1,28,28))
print(pred)
print(np.argmax(pred))

