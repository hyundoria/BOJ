import sys
from collections import deque

input = sys.stdin.readline

n,m,k = map(int, input().split())
graph = [list(map(int, input().strip())) for _ in range(n)]

move = [(-1,0), (1,0), (0,-1), (0,1)]

visited = [[[[-1]*(m) for _ in range(n)] for _ in range(k+1)] for _ in range(2)]

def bfs(x,y,k,d):

    q = deque()
    q.append((x,y,k,d))
    visited[d][k][x][y] = 1
    append = q.append

    while q:

        # d : 0 이면 밤 , 1이면 낮
        cx,cy,c,d = q.popleft()

        if cx == n-1 and cy == m-1:
            return visited[d][c][cx][cy]

        nd = 1-d
        vd = visited[d][c]
        vnd = visited[nd][c]
        curr = vd[cx][cy]

        for dx, dy in move:

            nx = cx + dx
            ny = cy + dy

            if nx < 0 or nx >= n or ny < 0 or ny >= m:
                continue

            g = graph[nx][ny]

            if g == 0:
                if vnd[nx][ny] == -1:
                    vnd[nx][ny] = curr + 1
                    append((nx, ny, c, nd))
                
            elif g == 1 and c > 0:
                vndc = visited[nd][c-1]
                if d == 1:
                    if vndc[nx][ny] == -1:
                        vndc[nx][ny] = curr + 1
                        append((nx, ny, c-1, nd))
                else:
                    if vnd[cx][cy] == -1:                           
                        vnd[cx][cy] = curr + 1
                        append((cx, cy, c, nd))
                    

    return -1

print(bfs(0,0,k,1))

# for wall in visited:
#     for row in wall:
#         print(row)
#     print()



