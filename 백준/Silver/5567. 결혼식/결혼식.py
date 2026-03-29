from collections import deque

n = int(input())

m = int(input())

graph = [[] for _ in range(n+1)]

for _ in range(m):
    a,b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)

visited = [-1] * (n+1)

def bfs():

    q = deque([1])
    visited[1] = 0

    while q:

        curr = q.popleft()

        for next in graph[curr]:
            if visited[next] == -1:
                visited[next] = visited[curr] + 1
                q.append(next)

bfs()

cnt = 0

for val in visited:
    if val == 1 or val == 2:
        cnt += 1

print(cnt)