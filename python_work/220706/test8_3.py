#1번

for i in range(1,10):
    if (7*i)%2!=0:
        continue
    print(7*i)



#2번
print("2번")
n=1
while n<100:
    n+=1    
    if n%2==0 and n%3==0:
        continue
    n+=1  
    print(n)



#3번
print("<3번>")
n=2
while n<100:
    
    if n%2!=0 and n%3!=0:
        print(n)
    n+=1
