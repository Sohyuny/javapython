
from car import Car

def main():
    c1=Car()
    print('main')
    while True : 
        print('1. 속도입력')
        print('2. 속도출력')
        select = int(input())
        if select == 1:
            speed=input("속도를 입력하세요 ")
            c1.speed=speed
        else:
            print("속도 = ",c1.speed)

main()


# c1 = Car()
# c1.speed()

# if true:
#     print("1. 속도입력")
#     print("2. 속도출력")
#     if c1==1:
#         print("속도입력?")
#         c1.speed = c1
#     else :
#         c1.speed = c1
#         print("현재속도는 ",c1.speed)
