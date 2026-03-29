from collections import deque

n,m = map(int, input().split())

graph = [[] for _ in range(n)]

for i in range(n):
    row = input()
    for r in row:
        graph[i].append(r)


visited = [[False] * m for _ in range(n)]
alphabet = [False] * 26

dxy = [[-1,0],[1,0],[0,1],[0,-1]]

def dfs(x,y,cnt):

    ori_cnt = cnt
    max_cnt = cnt

    for dx,dy in dxy:

        nx = x + dx
        ny = y + dy

        if 0 <= nx < n and 0 <= ny < m and not alphabet[ord(graph[nx][ny]) - 65] and not visited[nx][ny]:
            alphabet[ord(graph[nx][ny]) - 65] = True
            visited[nx][ny] = True
            cnt = dfs(nx, ny, cnt+1)
            max_cnt = max(cnt, max_cnt)

        cnt = ori_cnt

    visited[x][y] = False
    alphabet[ord(graph[x][y]) - 65] = False
    return max_cnt

alphabet[ord(graph[0][0]) - 65] = True
visited[0][0] = True
print(dfs(0,0, 1))

