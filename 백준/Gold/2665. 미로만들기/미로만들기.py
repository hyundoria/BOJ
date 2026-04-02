from collections import deque


def bfs(x,y):

    visited = [[-1] * (n+1) for _ in range(n)]
    visited[x][y] = 0
    move = [(-1,0), (1,0), (0,-1), (0,1)]

    q = deque()
    q.append((x,y))

    while q:

        cx,cy = q.popleft()

        for dx, dy in move:

            nx = cx + dx
            ny = cy + dy

            if nx < 0 or nx >= n or ny < 0 or ny >= n:
                continue

            if visited[nx][ny] == -1:

                if graph[nx][ny] == 0:
                    visited[nx][ny] = visited[cx][cy] + 1
                    q.append((nx,ny))
                else:
                    visited[nx][ny] = visited[cx][cy]
                    q.appendleft((nx,ny))


    return visited[n-1][n-1]

            



n = int(input())

graph = [[] for _ in range(n)]

for _ in range(n):

    row = (list(map(int, input())))

    for i in row:
        graph[_].append(i)

print(bfs(0,0))