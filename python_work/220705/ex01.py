st="The Espresso Sprit"

cnt=0
for i in st:
    cnt+=1
    if i == 'E':
        print(i)
        print(cnt)
    cnt+=1
print(st.find('E'))

myst = "한글입니다.\n 잘되네요."
print(myst)
myst="한글입니다 \t 잘되네요"
print(myst)
myst="한글입니다.\"잘되네요"
print(myst)
myst="한글입니다 \' 잘되네요"
print(myst)

mylist=[1,2,3,4,5]
del mylist[3:]
print(mylist)