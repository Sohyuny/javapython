
def func_1():
    sum=0
    for i in range(1,11,2):
        sum += i
    return sum

def func_2():
    sum=1
    for i in range(1,11):
        sum *= i
    return sum

def func_3():
    for i in range(1,10):
        print(7*i)

def func_4():
    for i in range(9,0,-1):
        print(7*i)

print(func_1())
print(func_2())
func_3()
func_4()

