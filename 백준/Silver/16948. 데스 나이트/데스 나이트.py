from collections import deque

n = int(input())

move = [(-2, -1), (-2, 1), (0, -2), (0, 2), (2, -1), (2, 1)]

sx,sy,ex,ey = map(int, input().split())

visited = [[float('inf')] * (n) for _ in range(n)]
visited[sx][sy] = 0

q = deque()

q.append((sx,sy))


while q:

    x,y = q.popleft()

    for dx,dy in move:

        nx = x + dx
        ny = y + dy

        if nx < 0 or nx >= n or ny < 0 or ny >= n:
            continue

        if visited[nx][ny] == float('inf'):
            visited[nx][ny] = visited[x][y] + 1

            if nx == ex and ny == ey:
                break
            q.append((nx,ny))

if visited[ex][ey] == float('inf'):
    print(-1)
else:
    print(visited[ex][ey])