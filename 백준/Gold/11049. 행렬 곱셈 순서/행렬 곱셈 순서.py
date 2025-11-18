import sys

n = int(input())

arr = []

for _ in range(n):

    ar = list(map(int, input().split()))
    arr.append(ar)

m = [[sys.maxsize] * n for _ in range(n)]

for i in range(n):
    m[i][i] = 0


for r in range(1, n):
    for i in range(n-r):

        j = i+r

        for k in range(i,j):

            m[i][j] = min(m[i][j], m[i][k] + m[k+1][j] + (arr[i][0]*arr[k][1]*arr[j][1]))

print(m[0][n-1])