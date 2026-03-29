import math

n = input().split(" ")

k = int(n[1])

arr = []

for i in range(int(n[0])):
    arr.append(int(input()))

arr.sort(reverse=True)

cnt = 0

while(k != 0):

    for i in range(int(len(arr))):
        if k >= arr[i]:
            m = math.floor(k / arr[i])
            cnt += m
            k -= arr[i] * m
            break


print(cnt)
