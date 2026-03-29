from collections import deque

n, m = map(int, input().split())

graph = []

for i in range(n):
    line = list(map(int, input().split()))
    graph.append(line)

def bfs(x,y):

    visited = [[0] * m for _ in range(n)]

    q = deque([(x, y)])
    visited[x][y] = 1

    move = [[-1, 0], [1, 0], [0, -1], [0, 1], [1,1], [-1,-1], [1,-1], [-1,1]]

    while q:

        x,y = q.popleft()

        for dx, dy in move:
            nx = x + dx
            ny = y + dy

            if nx < 0 or nx >= n or ny < 0 or ny >= m:
                continue

            if graph[nx][ny] == 1:
                return visited[x][y]

            if visited[nx][ny] == 0:
                visited[nx][ny] = visited[x][y] + 1
                q.append((nx, ny))

    return 0

max = 0

for i in range(n):
    for j in range(m):
        if graph[i][j] == 0:
            k = bfs(i, j)
            if k > max:
                max = k

print(max)