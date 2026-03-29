from collections import deque

n, m = map(int, input().split())

arr = [list(map(int, input().split())) for _ in range(n)]

visited = [[-1] * m for _ in range(n)]

move = [[-1, 0], [0, 1], [1, 0], [0, -1]]

def bfs(x,y):

    q = deque()
    q.append((x,y))
    visited[x][y] = 0

    while q:

        x,y = q.popleft()

        for dx, dy in move:

            nx = x + dx
            ny = y + dy

            if 0 <= nx < n and 0 <= ny < m and visited[nx][ny] == -1:
                if arr[nx][ny] == 1:
                    q.append((nx, ny))
                    visited[nx][ny] = visited[x][y] + 1



for i in range(n):
    for j in range(m):
        if arr[i][j] == 2:
            bfs(i,j)
        if arr[i][j] == 0:
            visited[i][j] = 0

for row in visited:
    for i in row:
        print(i, end=" ")
    print()



