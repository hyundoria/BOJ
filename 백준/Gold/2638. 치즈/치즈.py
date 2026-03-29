from collections import deque


def bfs_air(x,y,i):

    q = deque()
    q.append((x,y))
    visited[x][y] = True
    graph[x][y] = i

    while q:

        cx,cy = q.popleft()

        for dx,dy in move:
            nx = cx + dx
            ny = cy + dy

            if nx < 0 or nx >= n or ny < 0 or ny >= m:
                continue

            if graph[nx][ny] < 1 and not visited[nx][ny]:
                visited[nx][ny] = True
                graph[nx][ny] = i
                q.append((nx,ny))

def melt_cheese(x,y,i):

    global cheese

    cnt = 0

    for dx,dy in move:
        nx = x + dx
        ny = y + dy

        if graph[nx][ny] == -1 or 1 < graph[nx][ny] < i:
            cnt += 1

        if cnt == 2:
            graph[x][y] = i
            cheese -= 1
            bfs_air(x,y,i)
            break

def ck_air(x,y,i):

    for dx,dy in move:

        nx = x + dx
        ny = y + dy

        if graph[nx][ny] == -1 or 1 < graph[nx][ny] <= i:
            bfs_air(x,y,i)
            break

n,m = map(int, input().split())


# 벽이랑 만나는 공기 = -1, 벽이랑 만나지 않는 공기 = 0, 치즈 1
graph = []

cheese = 0

for i in range(n):

    row = list(map(int, input().split()))
    cheese += row.count(1)
    graph.append(row)

visited = [[False] * m for _ in range(n)]

move = [(-1,0), (1,0), (0,-1), (0,1)]

bfs_air(0,0,-1)

c = 0

while cheese > 0:

    c += 1

    for i in range(1,n-1):
        for j in range(1,m-1):

            if graph[i][j] == 1:
                melt_cheese(i,j,c+1)
            if graph[i][j] == 0:
                ck_air(i,j,c+1)
    
    # for row in graph:
    #     for i in row:
    #         print(f"{i:2d}", end=" ")
    #     print()
    # print()

print(c)