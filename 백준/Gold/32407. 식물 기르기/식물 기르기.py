import math

n = int(input())

arr = list(map(int, input().split()))

m = int(math.log2(max(arr)))

a = [0] * 17

for i in range(n):

    k = int(math.log2(arr[i]))

    if k == 0 or k == m:
        a[k] += 1
    else:
        a[m] += int(math.pow(2, (m-k)))

if m != 0:
    print((math.ceil(a[m] / pow(2,m))) + a[0])
else:
    print(a[0])