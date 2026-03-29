from collections import deque

def bfs(x, y):

    q = deque()
    q.append((x, y))
    visited[x][y] = True

    cnt = 0

    while q:
        x, y = q.popleft()

        # 상하좌우 확인
        for dx, dy in move:
            nx = x + dx
            ny = y + dy

            if nx < 0 or nx >= n or ny < 0 or ny >= m:
                continue

            if arr[nx][ny] == "X":
                continue

            if not visited[nx][ny]:
                visited[nx][ny] = True
                if arr[nx][ny] == "P":
                    cnt += 1
                q.append((nx, ny))

    if cnt == 0:
        return "TT"
    else:
        return cnt

move = [[-1, 0], [1, 0], [0, -1], [0, 1]]

n,m = map(int, input().split())

arr = []

visited = [[False] * m for _ in range(n)]

for _ in range(n):
    row = list(input())
    arr.append(row)

I = [(i,j) for i in range(n) for j in range(m) if arr[i][j] == "I"]

x, y = I[0]


print(bfs(x, y))

