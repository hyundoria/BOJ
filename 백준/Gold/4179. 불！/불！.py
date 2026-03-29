from collections import deque

n, m = map(int, input().split())

grid = []


for i in range(n):
    row = list(input())
    grid.append(row)

visited = [[-1] * m for _ in range(n)]

dxy = [[-1,0],[1,0],[0,1],[0,-1]]

def bfs():

    q = deque()

    for i in range(n):
        for j in range(m):
            if grid[i][j] == 'J':
                visited[i][j] = 1
                if i == 0 or i == n - 1 or j == 0 or j == m - 1:
                    return visited[i][j]
                q.append((i, j))
            if grid[i][j] == 'F':
                q.appendleft((i, j))
                visited[i][j] = 0


    while q:

        x,y = q.popleft()

        if grid[x][y] == 'F':

            for dx, dy in dxy:

                nx = x + dx
                ny = y + dy

                if nx < 0 or nx >= n or ny < 0 or ny >= m:
                    continue

                if visited[nx][ny] == -1 and grid[nx][ny] == '.':
                    visited[nx][ny] = 0
                    grid[nx][ny] = grid[x][y]
                    q.append((nx, ny))

        if grid[x][y] == 'J':

            for dx, dy in dxy:

                nx = x + dx
                ny = y + dy

                if nx < 0 or nx >= n or ny < 0 or ny >= m:
                    continue

                if visited[nx][ny] == -1 and grid[nx][ny] == '.':
                    visited[nx][ny] = visited[x][y] + 1

                    if nx == 0 or nx == n - 1 or ny == 0 or ny == m - 1:
                        return visited[nx][ny]

                    grid[nx][ny] = grid[x][y]
                    q.append((nx, ny))

            grid[x][y] = '.'

    return -1

possible = bfs()

if possible == -1:
    print("IMPOSSIBLE")
else:
    print(possible)

# for row in dp:
#     for r in row:
#         print(r, end=" ")
#     print()
