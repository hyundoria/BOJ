from collections import deque

def bfs(x, y):

    q = deque()
    q.append((x, y))
    visited[x][y] = 1

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

            if visited[nx][ny] == 0:
                visited[nx][ny] = visited[x][y] + 1
                q.append((nx, ny))


move = [[-1, 0], [1, 0], [0, -1], [0, 1]]

n,m = map(int, input().split())

arr = []

for _ in range(n):
    row = list(map(int, input()))
    arr.append(row)

visited = [[0] * m for _ in range(n)]

bfs(0,0)

print(visited[n-1][m-1])


