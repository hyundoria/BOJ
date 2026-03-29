from collections import deque

n,m,v = map(int, input().split())

graph = [[] for _ in range(n+1)]

for _ in range(m):

    a,b = map(int, input().split())

    graph[a].append(b)
    graph[b].append(a)

for i in range(1, n+1):
    graph[i].sort()

visited = [False] * (n+1)
visited[v] = True

def dfs(x):

    print(x, end=" ")

    for child in graph[x]:

        if not visited[child]:
            visited[child] = True
            dfs(child)


def bfs(x):

    q = deque()
    q.append(x)
    visited[x] = True

    while q:

        x = q.popleft()
        print(x, end=" ")

        for child in graph[x]:

            if not visited[child]:
                visited[child] = True
                q.append(child)

dfs(v)
visited = [False] * (n+1)
print()
bfs(v)
