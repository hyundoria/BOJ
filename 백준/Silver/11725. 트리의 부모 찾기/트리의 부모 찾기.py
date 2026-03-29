from collections import deque

n = int(input())

graph = [[] for _ in range(n+1)]

for _ in range(n-1):
    a,b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)

parent = [0] * (n+1)
visited = [False] * (n+1)

def bfs():

    q = deque([1])
    visited[1] = True

    while q:
        v = q.popleft()

        for u in graph[v]:
            if not visited[u]:
                visited[u] = True
                parent[u] = v
                q.append(u)

bfs()
for i in range(2, n+1):
    print(parent[i])