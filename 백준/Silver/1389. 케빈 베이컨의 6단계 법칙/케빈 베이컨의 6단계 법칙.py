import sys

INF = float('inf')

def floyd_warshall():

    for k in range(1,n+1):
        for i in range(1,n+1):
            for j in range(1, n+1):
                d[i][j] = min(d[i][j], d[i][k] + d[k][j])



n,m = map(int, input().split())

d = [[INF] * (n + 1) for _ in range(n + 1)]

for i in range(1, n + 1):
    d[i][i] = 0

for _ in range(m):
    a,b = map(int, input().split())
    d[a][b] = 1
    d[b][a] = 1

floyd_warshall()

idx = 0
k = INF

for i in range(1,n+1):
    s = 0
    for j in range(1, n+1):
        s += d[i][j]
    if s < k:
        k = s
        idx = i

print(idx)