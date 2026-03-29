from collections import deque

n, m = map(int, input().split())

graph = []

for _ in range(n):
    line = list(map(int, input()))
    graph.append(line)

insert = [i for i, ch in enumerate(graph[0]) if ch == 0]

visited = [[False] * m for _ in range(n)]

def bfs():

    q = deque()

    for idx in insert:
        q.append((0, idx))
        visited[0][idx] = True

    move = [[-1, 0], [1, 0], [0, -1], [0, 1]]

    while q:

        x,y = q.popleft()

        for dx, dy in move:
            nx = x + dx
            ny = y + dy

            if nx < 0 or nx >= n or ny < 0 or ny >= m:
                continue

            if graph[nx][ny] == 0 and not visited[nx][ny]:
                visited[nx][ny] = True
                q.append((nx, ny))

bfs()

if visited[n-1].count(True) > 0:
    print('YES')
else:
    print('NO')