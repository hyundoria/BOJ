from collections import deque

n = int(input())

graph = []

island = [[0] * n for _ in range(n)]

def bfs(i,j,cnt):

    move = [[1,0],[0,1],[-1,0],[0,-1]]

    q = deque()
    q.append((i,j))
    island[i][j] = cnt

    while q:

        x,y = q.popleft()

        for dx, dy in move:
            nx = x + dx
            ny = y + dy

            if nx < 0 or nx >= n or ny < 0 or ny >= n:
                continue

            if graph[nx][ny] == 0:
                island[x][y] = -cnt
                continue

            if island[nx][ny] == 0:
                island[nx][ny] = cnt
                q.append((nx, ny))

for _ in range(n):
    graph.append(list(map(int, input().split())))

cnt = 1

for i in range(n):
    for j in range(n):
        if graph[i][j] == 1 and island[i][j] == 0:
            bfs(i,j,cnt)
            cnt += 1

def sub(i,j):

    visited = [[-1] * n for _ in range(n)]

    move = [[1,0],[0,1],[-1,0],[0,-1]]

    q = deque()
    q.append((i,j))
    visited[i][j] = 0

    c = 0

    while q:

        x,y = q.popleft()

        for dx, dy in move:
            nx = x + dx
            ny = y + dy

            if nx < 0 or nx >= n or ny < 0 or ny >= n:
                continue

            if island[nx][ny] != island[i][j] and island[nx][ny] < 0:
                return visited[x][y]

            if graph[nx][ny] == 0 and visited[nx][ny] == -1:
                visited[nx][ny] = visited[x][y] + 1
                q.append((nx, ny))

    # for arr in visited:
    #     print(arr)
    # print()

    return 300

cnt = 300

for i in range(n):
    for j in range(n):
        if island[i][j] < 0:
            cnt = min(cnt, sub(i,j))

print(cnt)


