from collections import deque

def bfs():

    q = deque([(0,0,0)])
    visited[0][0][0] = 1

    move = [[0,1],[1,0],[0,-1],[-1,0]]

    while q:

        x, y, broke = q.popleft()

        if x == n-1 and y == m-1:
            return visited[x][y][broke]

        for dx, dy in move:

            nx = x + dx
            ny = y + dy

            if nx < 0 or ny < 0 or  nx >= n or ny >= m:
                continue

            if visited[nx][ny][broke] == 0 and graph[nx][ny] == 0:
                visited[nx][ny][broke] = visited[x][y][broke] + 1
                q.append((nx, ny, broke))
            elif visited[nx][ny][1] == 0 and graph[nx][ny] == 1 and broke == 0:
                visited[nx][ny][1] = visited[x][y][broke] + 1
                q.append((nx, ny, 1))

    return -1

n, m = map(int, input().split())

graph = [list(map(int, input())) for _ in range(n)]
visited = [[[0]*2  for _ in range(m)] for _ in range(n)]


print(bfs())




