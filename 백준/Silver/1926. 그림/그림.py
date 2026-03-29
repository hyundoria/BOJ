from collections import deque

def bfs(x, y):

    q = deque()
    q.append((x, y))
    visited[x][y] = True

    k = 1

    while q:
        x, y = q.popleft()

        # 상하좌우 확인
        for dx, dy in move:
            nx = x + dx
            ny = y + dy

            if nx < 0 or nx >= n or ny < 0 or ny >= m:
                continue

            if arr[nx][ny] == 0:
                continue

            if not visited[nx][ny]:
                visited[nx][ny] = True
                k += 1
                q.append((nx, ny))

    return k


move = [[-1, 0], [1, 0], [0, -1], [0, 1]]

n,m = map(int, input().split())

arr = []

for _ in range(n):
    row = list(map(int, input().split()))
    arr.append(row)

visited = [[False] * m for _ in range(n)]


cnt = 0
r = 0

for i in range(n):
    for j in range(m):
        if arr[i][j] == 1 and not visited[i][j]:
            k = bfs(i, j)
            r = max(k, r)
            cnt += 1

print(cnt)
print(r)
