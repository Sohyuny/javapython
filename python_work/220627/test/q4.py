def func_1():
    for i in range(1,6):
        print("Hi")

def func_2():
    for i in range(1,10):
        print(7*i)

def exp(num1,num2):
    for i in range(1,num2+1):
        num1**i
    print(num1**i)
        

def greet():
    a=int(input("인사를 몇 번 할까요? "))
    for i in range(1,a+1):
        print("반갑습니다.")




func_1()
func_2()
exp(2,3)
greet()