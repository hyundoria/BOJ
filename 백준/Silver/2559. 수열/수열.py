n, m = map(int, input().split())

arr = list(map(int, input().split()))

add = min(arr)


if add < 0:
    for i in range(n):
        arr[i] += -add


window = 0

for i in range(m):
    window += arr[i]

ans = window

for i in range(m, n):

    window = window - arr[i-m] + arr[i]
    ans = max(ans, window)

if add < 0:
    print(ans - (-add * m))
else:
    print(ans)