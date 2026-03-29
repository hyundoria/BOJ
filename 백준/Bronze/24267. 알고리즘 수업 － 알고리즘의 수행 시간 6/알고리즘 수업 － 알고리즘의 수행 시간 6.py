n = int(input())

j = n-2
k = 0
for i in range(1, n-1):
    k += i*j
    j = j-1

print(k)
print(3)
