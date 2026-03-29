from collections import deque

def bfs(x,y):

    q = deque([(x, y)])

    if visited[x][y]:
        return None

    visited[x][y] = True

    move = [[-1, 0], [1, 0], [0, -1], [0, 1]]

    while q:

        x,y = q.popleft()

        for dx, dy in move:
            nx = x + dx
            ny = y + dy

            if nx < 0 or nx >= h or ny < 0 or ny >= w:
                continue

            if graph[nx][ny] == ".":
                continue

            if not visited[nx][ny]:
                visited[nx][ny] = True
                q.append((nx, ny))

    return None

t = int(input())

for _ in range(t):

    h, w = map(int, input().split())

    graph = []

    for i in range(h):
        line = list(input())
        graph.append(line)


    visited = [[False] * w for _ in range(h)]

    cnt = 0

    for i in range(h):
        for j in range(w):
            if graph[i][j] == "#" and not visited[i][j]:
                bfs(i, j)
                cnt += 1

    print(cnt)

