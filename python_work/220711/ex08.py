from person import Person

p1 = Person()
p2 = Person()
p3 = Person()

p1.age = 39
p1.up_age()
print(p1.get_age())

p2.age = 59
p2.up_age()
print(p2.get_age())