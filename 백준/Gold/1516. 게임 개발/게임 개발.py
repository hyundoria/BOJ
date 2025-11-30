from collections import deque

n = int(input())

time = [0] * (n+1)

graph = [[] for _ in range(n + 1)]
e = [0] * (n + 1)

for i in range(1, n+1):
    arr = list(map(int, input().split()))

    time[i] = arr[0]

    for j in range(1, len(arr)-1):

        graph[arr[j]].append(i)
        e[i] += 1


q = deque()

dp = [0] * (n + 1)

for i in range(1, n + 1):

    if e[i] == 0:
        q.append(i)
        dp[i] = time[i]

ans = []

while q:

    node = q.popleft()
    ans.append(node)

    for i in graph[node]:
        e[i] -= 1
        dp[i] = max(dp[i], dp[node] + time[i])
        if e[i] == 0:
            q.append(i)

for i in range(1,n+1):
    print(dp[i])


