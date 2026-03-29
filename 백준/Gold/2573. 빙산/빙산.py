from collections import deque


def after_year():

    melt_board = [[0] * m for _ in range(n)]

    move = [[0,1],[0,-1],[1,0],[-1,0]]

    for x, y  in icebergs:

        for dx, dy in move:

            nx = x + dx
            ny = y + dy

            if nx < 0 or nx >= n or ny < 0 or ny >= m:
                continue

            if board[nx][ny] == 0:
                melt_board[x][y] += 1

    new_ice = set()
    for x, y in icebergs:
        board[x][y] = max(0 , board[x][y] - melt_board[x][y])
        if board[x][y] > 0:
            new_ice.add((x,y))

    return new_ice


def bfs(x,y):

    q = deque()
    q.append((x,y))
    visited[x][y] = True

    while q:

        x, y = q.popleft()

        move = [[0,1],[0,-1],[1,0],[-1,0]]

        for dx, dy in move:

            nx = x + dx
            ny = y + dy

            if nx < 0 or nx >= n or ny < 0 or ny >= m:
                continue

            if not visited[nx][ny] and board[nx][ny] != 0:
                visited[nx][ny] = True
                q.append([nx,ny])


n, m = map(int, input().split())

board = []

for _ in range(n):
    row = list(map(int, input().split()))
    board.append(row)

icebergs = [(i, j) for i in range(n) for j in range(m) if board[i][j] > 0]

icebergs = set(icebergs)

year = 0

while True:

    cnt = 0

    icebergs = after_year()

    if not icebergs:
        year = 0
        break

    year += 1

    visited = [[False] * m for _ in range(n)]

    for x, y in icebergs:

        if not visited[x][y]:
            cnt += 1
            bfs(x,y)

    if cnt >= 2:
        break

print(year)
