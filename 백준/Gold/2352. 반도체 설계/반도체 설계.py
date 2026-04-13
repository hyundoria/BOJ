import bisect

n = int(input())

arr = list(map(int, input().split()))

lis = [arr[0]]

for i in range(1,n):

    if arr[i] > lis[len(lis)-1]:
        lis.append(arr[i])
    else:
        k = bisect.bisect_left(lis, arr[i])
        lis[k] = arr[i]

print(len(lis))