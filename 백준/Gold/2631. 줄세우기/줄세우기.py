import bisect

n = int(input())

arr = []

for _ in range(n):

    arr.append(int(input()))


k = [arr[0]]

for i in range(1,n):

    if arr[i] > k[len(k)-1]:
        k.append(arr[i])
    else:
        t = bisect.bisect_left(k, arr[i])
        k[t] = arr[i]

print(n-len(k))