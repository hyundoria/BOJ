import sys

INF = float('inf')

def floyd_warshall():

    for i in range(1, n+1):
        for j in range(1, n+1):

            if w[i-1][j-1] != 0:
                d[i][j] = w[i-1][j-1]

    for k in range(1,n+1):
        for i in range(1,n+1):
            for j in range(1, n+1):
                d[i][j] = min(d[i][j], d[i][k] + d[k][j])

n = int(input())

w = []

d = [[INF] * (n + 1) for _ in range(n + 1)]

for _ in range(n):
    w.append(list(map(int, input().split())))

floyd_warshall()

for i in range(1,n+1):
    for j in range(1, n+1):


        if d[i][j] == INF:
            print(0, end=' ')
        else:
            print(1, end=' ')

    print()