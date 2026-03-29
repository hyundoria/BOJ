import math

n = int(input())

high = math.ceil(n/2)

product = []
plus = []

for i in range(n-high+1, n+1):
    product.append(i)
for i in range(n-high, 0, -1):
    plus.append(i)


for i in range(1, n+1):

    if i % 2 != 0:
        print(product.pop(0), end=" ")
    else:
        print(plus.pop(0), end=" ")

