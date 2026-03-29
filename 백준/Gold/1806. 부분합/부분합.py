n, m = map(int, input().split())

arr = list(map(int, input().split()))

ans = 100_001
start = 0
sum = 0

for end in range(n):

    sum += arr[end]

    while start <= end and sum >= m:

        if sum >= m:
            ans = min(ans, (end - start + 1))

        sum -= arr[start]
        start += 1

if ans == 100001:
    print(0)
else:
    print(ans)
