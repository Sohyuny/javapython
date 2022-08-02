from grpc import StatusCode


sum=0

class Accumulator:

    def __init__(self):
        self.sum=0
    @staticmethod
    def add(self,i):
        global sum
        self.sum = self.sum+i
    @staticmethod
    def showResult(self):
        print(sum)