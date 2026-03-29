from collections import deque

def bfs(x,y):

    q = deque()
    q.append((x,y))
    visited[x][y] = True

    cnt = 1

    while q:

        x, y = q.popleft()

        move = [[1,0], [0,1], [-1,0], [0,-1]]

        for dx,dy in move:

            nx = x + dx
            ny = y + dy

            if nx < 0 or nx >= m or ny < 0 or ny >= n:
                continue

            if arr[nx][ny] == 1:
                continue

            if not visited[nx][ny]:
                visited[nx][ny] = True
                cnt += 1
                q.append((nx,ny))

    return cnt

m, n, k = map(int, input().split())

arr = [[0] * n for _ in range(m)]

visited = [[False] * n for _ in range(m)]

for _ in range(k):

    lx, ly, rx, ry = map(int, input().split())

    rx, ry = ry-1, rx -1
    lx, ly = ly, lx

    for i in range(lx, rx+1):
        for j in range(ly, ry+1):
            arr[i][j] = 1

ans = []

cnt = 0

for i in range(m):
    for j in range(n):
        if not visited[i][j] and arr[i][j] == 0:
            ans.append(bfs(i,j))
            cnt += 1

ans.sort()

print(cnt)
for r in ans:
    print(r, end=" ")






