for i in range(1,10):
    if (7*i)%2==0:
        print(7*i,end=' ')


'''
문제 2
'''
num=2
while(num<100):
    if num%2==0 and num%3==0:
        print(num)
    num+=1

'''
문제3
'''
num=2
while(num<100):
    if num%2==0 and num%3==0:
        print(num)
        
    num+=1

'''
165페이지
1번
'''
for dan in range(2,10):
    for i in range(1,10):
        print(dan*i,end= " ")
    print()

'''
174페이지
1번
'''
def to_list(ds):
    return list(ds)
# ds=(1,2,3)
# ds=to_list(ds)