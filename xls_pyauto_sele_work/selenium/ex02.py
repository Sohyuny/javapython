from tqdm import tqdm
import time

mylist = [3,4,5,6,7]
for index, value in enumerate(mylist):
    print(index,value)

for index, i in tqdm(enumerate(range(10))):
    print(index)
    print(i)
    time.sleep(0.1)