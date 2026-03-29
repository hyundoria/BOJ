from collections import deque

n, m, r = map(int, input().split())

graph = [[] for _ in range(n+1)]

for _ in range(m):
    a,b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)

for i in range(1, n+1):
    graph[i].sort(reverse=True)

visited = [0] * (n+1)

def bfs():

    i = 1
    q = deque([r])
    visited[r] = i

    while q:

        curr = q.popleft()

        for next in graph[curr]:
            if visited[next] == 0:
                i += 1
                visited[next] = i
                q.append(next)

bfs()

for i in range(1, n+1):
    print(visited[i])