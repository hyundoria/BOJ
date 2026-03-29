n, m = map(int, input().split())

arr = []

for _ in range(n):
    arr.append(int(input()))

arr.sort()

end = max(arr) - min(arr)
start = 1
ans = 0

while start <= end:

    mid = (start + end) // 2

    cnt = 1

    house = arr[0]

    for i in range(1, n):

        if arr[i] - house >= mid:
            cnt += 1
            house = arr[i]


    if cnt >= m:
        ans = mid
        start = mid + 1
    else:
        end = mid - 1


print(ans)


