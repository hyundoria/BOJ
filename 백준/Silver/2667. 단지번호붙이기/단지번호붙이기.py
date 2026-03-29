from collections import deque

def bfs(x,y):

    q = deque()
    q.append((x,y))
    visited[x][y] = True

    cnt = 1

    while q:

        x, y = q.popleft()

        move = [[1,0], [0,1], [-1,0], [0,-1]]

        for dx,dy in move:

            nx = x + dx
            ny = y + dy

            if nx < 0 or nx >= n or ny < 0 or ny >= n:
                continue

            if board[nx][ny] == 0:
                continue

            if not visited[nx][ny]:
                visited[nx][ny] = True
                cnt += 1
                q.append((nx,ny))

    return cnt

n = int(input())

board = []

visited = [[False] * n for _ in range(n)]

for _ in range(n):
    row = list(map(int, input()))
    board.append(row)

cnt = 0
ans = []

for i in range(n):
    for j in range(n):
        if board[i][j] == 1 and not visited[i][j]:
            ans.append(bfs(i, j))
            cnt += 1

ans.sort()

print(cnt)
for a in ans:
    print(a)




