from collections import deque

m, n = map(int, input().split())

graph = []

for _ in range(n):

    row = list(map(int, input()))
    graph.append(row)


visited = [[-1] * (m) for _ in range(n)]
move = [(-1,0), (1,0), (0,-1), (0,1)]

def bfs(x,y):

    q = deque()
    q.append((x,y))
    visited[x][y] = 0

    while q:

        cx,cy = q.popleft()

        for dx, dy in move:

            nx = cx + dx
            ny = cy + dy

            if nx < 0 or nx >= n or ny < 0 or ny >= m:
                continue

            if graph[nx][ny] == 0 and visited[nx][ny] == -1:
                visited[nx][ny] = visited[cx][cy] + 0
                q.appendleft((nx,ny))
            elif graph[nx][ny] == 1 and visited[nx][ny] == -1:
                visited[nx][ny] = visited[cx][cy] + 1
                q.append((nx,ny))


bfs(0,0)

print(visited[n-1][m-1])