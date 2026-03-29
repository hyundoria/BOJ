k, n = map(int, input().split())

arr = []

end = 0
start = 1
ans = 0

for _ in range(k):
    arr.append(int(input()))
    end = max(arr[_], end)


while start <= end:

    cnt = 0

    mid = (start + end) // 2

    if mid == 0:
        break

    for line in arr:

        cnt += line // mid

    if cnt >= n:
        ans = mid
        start = mid + 1
    else:
        end = mid - 1


print(ans)


