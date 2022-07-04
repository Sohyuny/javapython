#1번
print("1번")
st=[]
st.append(1)
st.append(2)
st.append(3)
print(st)

st.remove(1)
print(st)
st.remove(2)
print(st)
st.remove(3)
print(st)

#2번
print("2번")
st=[]
st.append(1)
st.append(2)
st.append(3)
print(st)

st.pop(2)
print(st)
st.pop(1)
print(st)
st.pop(0)
print(st)



#3번
print("3번")
st=[1,2,3,4]
st.clear()
print(st)


#4번
print("4번")
st=[]
for i in range(0,11):
    st.append(i)
print(st)
for i in range(0,11):
    st.remove(i)
print(st)

#5번
print("5번")
st=[]
for i in range(0,11):
    st.append(i)
print(st)

for i in range(10,-1,-1):
    st.remove(i)
print(st)



#6번
print("6번")
st=[1,2]
st.extend([3,4,5])
print(st)

st.insert(2,[3,4,5])
print(st)