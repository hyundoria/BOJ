from collections import deque


def bfs():

    q = deque()

    for i in range(h):
        for j in range(n):
            for r in range(m):
                if board[i][j][r] == 'S':
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

            if visited[nz][nx][ny] == -1 and board[nz][nx][ny] != '#':
                visited[nz][nx][ny] = visited[z][x][y] + 1
                if board[nz][nx][ny] == 'E':
                    return  visited[nz][nx][ny]
                q.append((nz, nx, ny))

    return -1

while True:

    h, n, m = map(int, input().split())

    if m == 0 and n == 0 and h == 0:
        break

    board = []

    for _ in range(h):
        box = []
        for _ in range(n):
            row = list(input())
            box.append(row)
        input()
        board.append(box)

    visited = [[[-1] * m for _ in range(n)] for _ in range(h)]

    time = bfs()

    if time == -1:
        print("Trapped!")
    else:
        print(f'Escaped in {time} minute(s).')

