def main():
    while True:
        try :
            print('나이를 입력하세요. ')
            age = int(input())
            print('입력하신 나이는',age,'입니다. ')
            break
        except ValueError:
            print('나이를 숫자로 입력하세요. ')
    print("만나서 반갑습니다.")

main()
