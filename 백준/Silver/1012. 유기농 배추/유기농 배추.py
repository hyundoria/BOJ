from collections import deque


def bfs(x, y):

    q = deque()
    q.append((x, y))
    visited[x][y] = True

    while q:
        x, y = q.popleft()

        for dx, dy in move:
            nx = x + dx
            ny = y + dy

            if nx < 0 or nx >= m or ny < 0 or ny >= n:
                continue

            if arr[nx][ny] == 0:
                continue

            if not visited[nx][ny]:
                visited[nx][ny] = True
                q.append((nx, ny))

t = int(input())

move = [[-1, 0], [1, 0], [0, -1], [0, 1]]

for i in range(t):

    m,n,k = map(int, input().split())

    arr = [[0] * n for _ in range(m)]
    visited = [[False] * n for _ in range(m)]

    for j in range(k):
        x,y = map(int, input().split())
        arr[x][y] = 1

    cnt = 0

    for i in range(m):
        for j in range(n):
            if arr[i][j] == 1 and not visited[i][j]:
                bfs(i, j)
                cnt += 1

    print(cnt)


