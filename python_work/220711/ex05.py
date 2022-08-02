'''
page 181
문제 1
구구단의 7단 거꾸로 출력하는 for루프와 range 코드 사용

문제 2
다1에서 100까지 증가하다가 다시 1씩 줄어드는 튜플 만들기
'''
print('<문제 1번>')
for i in range(9,0,-1):
    print(7*i,end=' ')

print()
print("<문제 2번>")
a=[i for i in range(1,101)]
a=tuple(a)
b=[i for i in range(99,0,-1)]
b=tuple(b)
c=a+b
print(c)

'''
page 187
'''
for i in range(3):
    print(i+1,i+2,i+3)