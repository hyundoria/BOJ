import sys
import math
sys.setrecursionlimit(10**6)

def dfs(y,x):
    
    if x < 1 or x > m or y < 1 or y > n:
        return 0

    if visited[y][x] or graph[y][x] == 0:
        return 0

    visited[y][x] = True
    cnt = 1

    cnt += dfs(y-1,x)
    cnt += dfs(y+1,x)
    cnt += dfs(y,x-1)
    cnt += dfs(y,x+1)

    return cnt
    

n,m,k = map(int, input().split())

graph = [[0] * (m+1) for _ in range(n+1)]

for _ in range(k):

    a,b = map(int, input().split())
    graph[a][b] = 1

# for row in graph:
#     for i in row:
#         print(i, end=" ")
#     print()


visited = [[False] * (m+1) for _ in range(n+1)]


t = 0

for y in range(1,n+1):
    for x in range(1,m+1):
        if graph[y][x] == 1 and not visited[y][x]:
            c = dfs(y,x)
            if c > t:
                t = c


print(t)