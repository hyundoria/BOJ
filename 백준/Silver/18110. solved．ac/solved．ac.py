import math

n = int(input())

if n == 0:
     print(0)
     exit(0)

arr = [int(input()) for i in range(n)]

arr.sort()

k = math.floor(n * 0.15  + 0.5)

num = 0

for i in range(k, n-k):
     num += arr[i]

print(math.floor(num / (n-(2*k)) + 0.5 ))
