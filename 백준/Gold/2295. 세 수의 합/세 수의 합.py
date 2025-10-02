import bisect

n = int(input())

arr = []

for _ in range(n):
    arr.append(int(input()))

arr.sort()

two = {}

m = max(arr)

for i in range(n-1):
    for j in range(i, n-1):

        if arr[i] + arr[j] > m:
            continue
        two[arr[i]+arr[j]] = 1


for i in range(n-1,-1,-1):
    for j in range(n):
        gap = arr[i] - arr[j]
        if two.get(gap, -1) != -1:
            print(arr[i])
            exit(0)


