from collections import deque

def bfs(s):

    q = deque([s])

    visited[s] = True

    while q:

        x = q.popleft()

        ai = graph[x]

        for nx in (x - ai, x + ai):
            if 0 <= nx < n and not visited[nx]:
                visited[nx] = 1
                q.append(nx)

n = int(input())

graph = list(map(int, input().split()))

visited = [False] * n

s = int(input()) - 1

bfs(s)

print(visited.count(True))