from collections import deque

def bfs(x, y, r):

    q = deque()
    q.append((x,y))
    visited[x][y] = True

    while q:

        x, y = q.popleft()

        move = [[0,1], [1,0], [-1,0], [0,-1]]

        for dx, dy in move:

            nx = x + dx
            ny = y + dy

            if nx < 0 or nx >= n or ny < 0 or ny >= n:
                continue

            if arr[nx][ny] < r:
                continue

            if not visited[nx][ny]:
                visited[nx][ny] = True
                q.append((nx, ny))


n = int(input())

arr = []

rain = 0

for _ in range(n):
    row = list(map(int, input().split()))
    rain = max(max(row), rain)
    arr.append(row)

safe = 1

for t in range(1, rain):
    cnt = 0
    visited = [[False] * n for _ in range(n)]

    for i in range(n):
        for j in range(n):
            if arr[i][j] <= t:
                arr[i][j] = 0

    for i in range(n):
        for j in range(n):
            if arr[i][j] != 0 and not visited[i][j]:
                bfs(i, j, t)
                cnt += 1

    safe = max(cnt, safe)

print(safe)