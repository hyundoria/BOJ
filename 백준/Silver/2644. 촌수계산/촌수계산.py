from collections import deque

n = int(input())

x, y = map(int, input().split())

m = int(input())

graph = [[] for _ in range(n+1)]

for _ in range(m):
    a,b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)

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

print(visited[y])
