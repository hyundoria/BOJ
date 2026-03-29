n, m = map(int, input().split())

arr = list(map(int, input().split()))

end = max(arr)
start = 1
ans = 0


while start <= end:

    cnt = 0

    mid = (start + end) // 2

    if mid == 0:
        break

    for line in arr:

        if line - mid > 0:
            cnt += line -mid

    if cnt >= m:
        ans = mid
        start = mid + 1
    else:
        end = mid - 1


print(ans)


