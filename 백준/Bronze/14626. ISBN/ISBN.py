n = list(input())

rand = 0

num = 0

for i in range(len(n)):

     if n[i] == "*":
          if i % 2 == 0:
               rand = 1
          else:
               rand = 3
     else:
          a = int(n[i])

          if i % 2 == 0:
               num += a
          else:
               num += a*3

isbn3 = [0,3,6,9,2,5,8,1,4,7]

if rand == 1:
     print(10 - num % 10)
else:
     print(isbn3[num%10])