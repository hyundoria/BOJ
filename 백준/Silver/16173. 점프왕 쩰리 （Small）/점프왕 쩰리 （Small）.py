from collections import deque

n = int(input())

graph = [list(map(int, input().split())) for _ in range(n)]

visited = [[False]*n for _ in range(n)]

dx = [1,0]

dy = [0,1]


def bfs(x, y):
    q = deque()
    q.append([x, y])
    visited[x][y] = True

    while q:
        x, y = q.popleft()

        step = graph[x][y]

        if graph[x][y] == -1:
            return True

        for move in range(2):

            nx = x+dx[move] * step
            ny = y+dy[move] * step

            if nx < 0 or ny < 0 or nx >= n or ny >= n:

                continue

            if not visited[nx][ny]:
                visited[nx][ny] = True

                q.append([nx, ny])

    return False

if bfs(0,0):
    print("HaruHaru")
else:
    print("Hing")

