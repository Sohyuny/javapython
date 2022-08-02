try : 
    age = int (input('나이입력'))
    a = age/0
# except ValueError:
#     print('한글을 적으면 우째')
# except ZeroDivisionError:
#     print('0으로 나눌 수 없걸랑')
except Exception as e:
    print('모든 에러는 여기로 옵니다',e)
print('종료')
