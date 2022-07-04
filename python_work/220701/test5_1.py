#1번
st=[1,2,3,4]
print(st[0:4])

#2번
st=[1,2,3,4]
print(st[-4],st[-3],st[-2],st[-1])

#3번
st=[1,2,3,4]
st[0]+=1
st[1]+=1
st[2]+=1
st[3]+=1
print(st[0:4])

#4번
st=[1,2,3,4,5,6,7,8,9,10]
for i in range(0,10):
    st[i]+=1
print(st)

#5번
st=[1,2,3,4,5,6]
st[0],st[-1]=st[-1],st[0]
print(st)