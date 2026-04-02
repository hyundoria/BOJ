from collections import deque


k = int(input())

m,n = map(int, input().split())

graph = []

for _ in range(n):

    row = list(map(int, input().split()))
    graph.append(row)

move_default = [(-1,0), (1,0), (0,-1), (0,1)]
move_hores = [(-2,-1), (-2,1), (2,-1), (2,1), (-1,-2), (-1,2), (1,-2), (1,2)]

visited = [[[(-1)]*(m) for _ in range(n)] for _ in range(k+1)]

def bfs(x,y,k):

    q = deque()
    q.append((x,y,k))
    visited[k][x][y] = 0

    while q:

        cx,cy,c = q.popleft()

        if cx == n-1 and cy == m-1:
            return visited[c][cx][cy]


        if c > 0:
            for dx, dy in move_hores:

                nx = cx + dx
                ny = cy + dy

                if nx < 0 or nx >= n or ny < 0 or ny >= m or graph[nx][ny] == 1:
                    continue
                    
                if visited[c-1][nx][ny] == -1:
                    visited[c-1][nx][ny] = visited[c][cx][cy] + 1
                    q.append((nx,ny,c-1))
        
        
        for dx, dy in move_default:

            nx = cx + dx
            ny = cy + dy

            if nx < 0 or nx >= n or ny < 0 or ny >= m or graph[nx][ny] == 1:
                continue
                    
            if visited[c][nx][ny] == -1:
                visited[c][nx][ny] = visited[c][cx][cy] + 1
                q.append((nx,ny,c))

    return -1

print(bfs(0,0,k))
        


