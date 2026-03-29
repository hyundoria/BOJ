from collections import deque

n, m, k, x = map(int, input().split())

graph = [[] for _ in range(n+1)]

for _ in range(m):
    a,b = map(int, input().split())
    graph[a].append(b)

visited = [-1] * (n+1)

def bfs(start):

    q = deque()
    q.append(start)
    visited[start] = 0

    while q:

        curr = q.popleft()

        for next in graph[curr]:
            if visited[next] == -1:
                visited[next] = visited[curr] + 1
                q.append(next)


bfs(x)

cnt = 0

for i in range(1, n+1):

    if visited[i] == k:
        cnt += 1
        print(i)

if cnt == 0:
    print(-1)