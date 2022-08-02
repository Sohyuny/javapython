'''
217페이지
'''

dc = {'새우깡':700, '콘치즈':850, '꼬깔콘':750}
dc['홈런볼'] = 900
print(dc)

for i in dc:
    dc[i] +=100
print(dc)
del dc['콘치즈']
print(dc)
dc['치즈콘'] =950
print(dc)