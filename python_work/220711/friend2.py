class Friend:
    def __init__(self,name,phone):
        self.name = name
        self.phone = phone

    def get_name(self):
        print(self.name)
    def get_phone(self):
        print(self.phone)
    def show_info(self):
        print("이름 :",self.name)
        print("전화번호 :",self.phone)