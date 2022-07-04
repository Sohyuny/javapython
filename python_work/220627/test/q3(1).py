def func_1():
    sum=0
    for i in [1,3,5,7,9]:
        sum += i
    return sum

def func_2():
    sum=1
    for i in [1,2,3,4,5,6,7,8,9,10]:
        sum *= i
    return sum

def func_3():
    for i in [1,2,3,4,5,6,7,8,9]:
        print(7*i)

def func_4():
    for i in [9,8,7,6,5,4,3,2,1]:
        print(7*i)

print(func_1())
print(func_2())
func_3()
func_4()