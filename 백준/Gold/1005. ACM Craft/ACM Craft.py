from collections import deque

t = int(input())

for _ in range(t):

    n,m = map(int, input().split())

    time = list(map(int, input().split()))
    time.insert(0,0)

    graph = [[] for _ in range(n+1)]
    e = [0] * (n+1)

    for _ in range(m):
        a,b = map(int, input().split())
        graph[a].append(b)
        e[b] += 1

    last = int(input())

    q = deque()

    dp = [0] * (n+1)

    for i in range(1,n+1):

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

    print(dp[last])


