from collections import deque


def bfs():

    q = deque()

    for i in range(h):
        for j in range(n):
            for r in range(m):
                if board[i][j][r] == 1:
                    q.append((i, j, r))
                    visited[i][j][r] = 0

    while q:

        z, x, y = q.popleft()

        move = [[0, 0,1],[0, 0,-1],[0,1,0],[0,-1,0],[1,0,0],[-1,0,0]]

        for dz, dx, dy in move:

            nx = x + dx
            ny = y + dy
            nz = z + dz

            if nx < 0 or nx >= n or ny < 0 or ny >= m or nz < 0 or nz >= h:
                continue

            if visited[nz][nx][ny] == -1 and board[nz][nx][ny] == 0:
                visited[nz][nx][ny] = visited[z][x][y] + 1
                q.append((nz, nx, ny))

    return -1

m, n, h = map(int, input().split())
board = []

for _ in range(h):
    box = []
    for _ in range(n):
        row = list(map(int, input().split()))
        box.append(row)
    board.append(box)

visited = [[[-1] * m for _ in range(n)] for _ in range(h)]

bfs()

day = 0

for i in range(h):
    for j in range(n):
        for r in range(m):
            if board[i][j][r] == 0:
                if visited[i][j][r] == -1:
                    print(-1)
                    exit(0)
            day = max(day, visited[i][j][r])

print(day)