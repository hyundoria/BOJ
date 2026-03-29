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

            if nx < 0 or nx >= h or ny < 0 or ny >= w:
                continue

            if arr[nx][ny] == 0:
                continue

            if not visited[nx][ny]:
                visited[nx][ny] = True
                q.append((nx, ny))


move = [[-1, 0], [1, 0], [0, -1], [0, 1], [-1, -1], [1, 1], [1, -1], [-1, 1]]

while True:

    w,h = map(int, input().split())

    if w == 0 and h == 0:
        break

    arr = [list(map(int, input().split())) for _ in range(h)]
    visited = [[False] * w for _ in range(h)]

    cnt = 0

    for i in range(h):
        for j in range(w):
            if arr[i][j] == 1 and not visited[i][j]:
                bfs(i, j)
                cnt += 1

    print(cnt)