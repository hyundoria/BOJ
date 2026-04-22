n = int(input())

arr = []
for i in range(n):

    k = (input().split())
    k_int = list(map(int, k))
    arr.append(k_int)

arr.sort(key = lambda x : (x[1], x[0]))

cnt = 1

k = 1
r = 0

while(r+k < len(arr)):

    if arr[r][1] <= arr[r+k][0]:
        cnt += 1
        r = r+k
        k = 1
    else:
        k += 1


print(cnt)