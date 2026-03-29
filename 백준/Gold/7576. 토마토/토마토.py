from collections import deque


def bfs():

    q = deque()

    for i in range(n):
        for j in range(m):
            if board[i][j] == 1:
                q.append((i, j))
                visited[i][j] = 0

    while q:

        x, y = q.popleft()

        move = [[0,1],[0,-1],[1,0],[-1,0]]

        for dx, dy in move:

            nx = x + dx
            ny = y + dy

            if nx < 0 or nx >= n or ny < 0 or ny >= m:
                continue

            if visited[nx][ny] == -1 and board[nx][ny] == 0:
                visited[nx][ny] = visited[x][y] + 1
                q.append((nx, ny))

    return -1

m, n = map(int, input().split())
board = []

for _ in range(n):
    row = list(map(int, input().split()))
    board.append(row)

visited = [[-1] * m for _ in range(n)]

bfs()

day = 0

for i in range(n):
    for j in range(m):
        if board[i][j] == 0:
            if visited[i][j] == -1:
                print(-1)
                exit(0)
        day = max(day, visited[i][j])

print(day)