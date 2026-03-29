from collections import deque

n = int(input())

arr = list(map(int, input().split()))

ans = 0

start = 0

fruit = [0] * 10
cnt = 0

for end in range(n):

        if fruit[arr[end]] == 0:
            cnt += 1
        fruit[arr[end]] += 1

        while cnt > 2:

            fruit[arr[start]] -= 1

            if fruit[arr[start]] == 0:
                cnt -= 1

            start += 1

        ans = max(ans, end - start + 1)

print(ans)
