def int_div(num1,num2):
    print("몫 :",num1//num2)
    print("나머지 :",num1%num2)

def bet_sum(num1,num2):
    num3=int(num1)
    num4=int(num2)
    sum=0
    for i in range(num3+1,num4):
        sum+=i
    print(sum)


int_div(5,2)

bet_sum(2,5)
bet_sum(1,5)