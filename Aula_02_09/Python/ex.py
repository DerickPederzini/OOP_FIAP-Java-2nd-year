import random


aux = input("Digite a: ")
a = int(aux)

aux = input("Dogote B: ")
b = int(aux)
class Test: 

    def __init__(self, a, b):
        self.a = a
        self.b = b

    def sum(a, b):
        return a+b
    
    def multiplcation(a, b):
        return a*b
    
    def subtraction(a,b):
        return a - b
    
    def generateRandom():

        ask = input("want to be a in between a and b? ")
        answer = bool(ask)

        if(answer):
            rand = random.randrange(a, b)
            print(rand)
        else:
            rand = random.randint(1, 100)

        return rand
    
    
obj = Test(a, b)
print(obj.sum(a, b))