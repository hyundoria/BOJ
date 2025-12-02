import sys

INF = float('inf')

def floyd_warshall():

    for k in range(1,n+1):
        for i in range(1,n+1):
            for j in range(1, n+1):
                d[i][j] = min(d[i][j], d[i][k] + d[k][j])



n,m,r = map(int, input().split())

item = list(map(int, input().split()))
item.insert(0,0)

d = [[INF] * (n + 1) for _ in range(n + 1)]

for i in range(1, n + 1):
    d[i][i] = 0

for _ in range(r):
    a,b,c = map(int, input().split())
    d[a][b] = c
    d[b][a] = c

floyd_warshall()

max_cnt = -INF

for i in range(1, n+1):
    cnt = 0
    for j in range(1, n+1):
        if d[i][j] <= m:
            cnt += item[j]
    max_cnt = max(cnt, max_cnt)

print(max_cnt)
