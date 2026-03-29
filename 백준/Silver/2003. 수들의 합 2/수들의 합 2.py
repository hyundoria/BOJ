from collections import deque

n,m = map(int, input().split())

arr = list(map(int, input().split()))

ans_cnt = 0

for start in range(n):

    plus = arr[start]
    end = start + 1

    if plus == m:
        ans_cnt += 1
        continue

    while end < n and plus != m:

        plus += arr[end]

        end += 1

        if plus == m:
            ans_cnt += 1
            break

print(ans_cnt)
