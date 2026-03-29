n = int(input())

h = list(input())

num = 0

for i in range(n):

     k = ord(h[i])-96

     num += k * pow(31,i)


print(num%1234567891)