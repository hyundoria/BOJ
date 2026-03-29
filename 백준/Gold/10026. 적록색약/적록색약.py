from collections import deque


def bfs(x, y, c, visited, arr):

    q = deque([(x, y)])
    visited[x][y] = True

    while q:

        x, y = q.popleft()

        move = [[0,1],[0,-1],[1,0],[-1,0]]

        for dx, dy in move:

            nx = x + dx
            ny = y + dy

            if nx < 0 or nx >= n or ny < 0 or ny >= n:
                continue

            if not visited[nx][ny] and arr[nx][ny] == c:
                visited[nx][ny] = True
                q.append((nx, ny))

    return -1

n = int(input())

board = []
green = []

for _ in range(n):
    row = list(input())

    gr = []
    for r in row:
        if r == 'G':
            gr.append('R')
        else:
            gr.append(r)


    board.append(row)
    green.append(gr)

visited1 = [[False] * n for _ in range(n)]
visited2 = [[False] * n for _ in range(n)]

cnt1 = 0
cnt2 = 0

for i in range(n):
    for j in range(n):

        if not visited1[i][j]:
            bfs(i,j,board[i][j], visited1, board)
            cnt1 += 1

        if not visited2[i][j]:
            bfs(i,j,green[i][j], visited2, green)
            cnt2 += 1

print(cnt1, cnt2)
