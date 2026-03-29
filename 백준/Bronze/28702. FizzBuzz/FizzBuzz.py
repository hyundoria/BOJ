a = input()
b = input()
c = input()

k = [a,b,c]

n = 0

for i in range(3):

     if 48 <= ord(k[i][0]) <= 57:
          n = int(k[i]) + 3-i

if n % 3 == 0 and n % 5 == 0:
     print("FizzBuzz")
elif n % 3 == 0:
     print("Fizz")
elif n % 5 == 0:
     print("Buzz")
else:
     print(n)