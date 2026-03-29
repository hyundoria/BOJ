from collections import deque

n,  m = map(int, input().split())

k = [i for i in range(1, n + 1)]

graph = [[] for _ in range(n+1)]

for _ in range(m):

    a, b = map(int, input().split())

    graph[a].append(b)
    graph[b].append(a)

visited = [False] * (n+1)

def bfs(n):

    q = deque([n])
    visited[n] = True

    while q:

        curr = q.popleft()

        for ne in graph[curr]:

            if not visited[ne]:
                visited[ne] = True
                q.append(ne)

cnt = 0

for i in range(1, n + 1):
    if not visited[i]:
        bfs(i)
        cnt += 1

print(cnt)