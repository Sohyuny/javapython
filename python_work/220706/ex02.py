# #2번
# print("2번")
# def birth_only(org):
#     ret=org.split('-')
#     print(ret[0])

# p1="070609-2011xxx"
# p1=birth_only(p1)
# p2="090716-1012xxx"
# p2=birth_only(p2)



def birth_only(p1):
    return p1.split('-')[0]

p1 = "070609-2011xxx"
p1 = birth_only(p1)
