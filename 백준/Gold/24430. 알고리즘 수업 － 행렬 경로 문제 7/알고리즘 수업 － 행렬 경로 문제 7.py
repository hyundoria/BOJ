import itertools
from itertools import count


def matrix_path(arr, n, m, p):

    dp = [[(0,0)  for _ in range(n+1)] for _ in range(n+1)]

    points_set = set(p)

    for i in range(1, n+1):
        for j in range(1, n+1):

            up = dp[i-1][j]
            left = dp[i][j-1]

            if up[0] > left[0]:
                best = up
            elif up[0] < left[0]:
                best = left
            else:
                if up[1] > left[1]:
                    best = up
                else:
                    best = left

            count = best[1]

            if (i,j) in points_set:
                count += 1

            dp[i][j] =  (best[0] + arr[i-1][j-1], count)


    return dp[n][n]

'''
    for row in dp:
        print(row)
'''


n = int(input())

arr = []

for _ in range(n):
    row = list(map(int, input().split()))
    arr.append(row)

m = int(input())

points = []

for _ in range(m):
    x, y = map(int, input().split())
    points.append((x, y))

points = sorted(points, key=lambda point: (point[0], point[1]))

val, cnt = matrix_path(arr, n, m ,points)

print(val, cnt)

