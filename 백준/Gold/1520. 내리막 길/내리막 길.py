import sys
sys.setrecursionlimit(10**7)

n,m = map(int, input().split())

graph = [list(map(int, input().split())) for _ in range(n)]

dp = [[-1] * m for _ in range(n)]

dxy = [[-1,0],[1,0],[0,1],[0,-1]]

def dfs(x,y):

    if dp[x][y] != -1:
        return dp[x][y]

    if x == n-1 and y == m-1:
        return 1

    dp[x][y] = 0

    for dx,dy in dxy:

        nx = x + dx
        ny = y + dy

        if 0 <= nx < n and 0 <= ny < m and graph[x][y] > graph[nx][ny]:
            dp[x][y] += dfs(nx,ny)


    return dp[x][y]

print(dfs(0,0))

# for row in dp:
#     for r in row:
#         print(r, end=" ")
#     print()
