#1번
print("<1번 문제>")
def main():
    num=int(input("숫자를 입력하세요. "))
    if num>=0:
        print("입력한 값은 0이거나 0보다 큽니다.")
    else :
        print("입력한 값은 0보다 작습니다.")

main()


#2번
print("<2번 문제>")

num=3
if num>1 and num<5:
    print(True)
else:
    print(False)


#3번
print("<3번 문제>")

num=12
print("num에 저장된 값은 3보다 작거나 10보다 큰가?")
if num<3 or num>10:
    print(True)
else:
    print(False)


#4번
print("<4번 문제>")
num=4
print("num에 저장된 값은 2의 배수이지만 3의 배수는 아니다. 맞는가?")
if num%2==0 and num%3!=0:
    print(True)
else:
    print(False)

#5번
print("<5번 문제>")
def main():
    num=int(input("숫자를 입력하세요. "))
    if num<0 :
        print("입력한 값은 0보다 작습니다.")
    elif num>=0 and num<10:
        print("입력한 값은 0이상 10미만입니다.")
    elif num>=10 and num<20:
        print("입력한 값은 10이상 20미만입니다.")
    else : 
        print("입력한 값은 20이상입니다.")

main()
