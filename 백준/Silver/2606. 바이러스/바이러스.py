from collections import deque

n = int(input())

m = int(input())

graph = [[] for _ in range(n+1)]

for _ in range(m):

    a, b = map(int, input().split())

    graph[a].append(b)
    graph[b].append(a)

visited = [False] * (n+1)

def bfs():

    q = deque([1])
    visited[1] = True

    while q:

        curr = q.popleft()

        for next in graph[curr]:

            if not visited[next]:
                visited[next] = True
                q.append(next)


    print(sum(visited) - 1)

bfs()

