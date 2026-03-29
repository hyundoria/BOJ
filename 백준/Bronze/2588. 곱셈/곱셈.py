A = int(input())
B = int(input())

A = int(A)
B = int(B)

a = B%10
b = (B//10) % 10
c = B//100

print(A * a)
print(A * b)
print(A * c)
print(A * B)