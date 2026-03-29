import itertools


def sub_path(arr, sx, sy, ex, ey):

    dx = ex - sx + 1
    dy = ey - sy + 1

    dp = [[0] * (dy+1) for _ in range(dx+1)]

    for i in range(1, dx+1):
        for j in range(1, dy+1):
            dp[i][j] = arr[sx+i-2][sy+j-2] + max(dp[i-1][j], dp[i][j-1])

    return dp[dx][dy]

def matrix_path(arr, n, m, comb):

    if not comb:
        return -1

    d1 = [[0] * (n+1) for _ in range(n+1)]

    for i in range(1, n+1):
        for j in range(1, n+1):
            d1[i][j] = arr[i-1][j-1] + max(d1[i - 1][j], d1[i][j - 1])

    d2 = [[0] * (n+2) for _ in range(n+2)]

    for i in range(n, 0, -1):
        for j in range(n, 0, -1):
            d2[i][j] = arr[i-1][j-1] + max(d2[i + 1][j], d2[i][j + 1])

    score = 0

    x0,y0 = comb[0]
    score += d1[x0][y0]

    for i in range(m-1):

        x1,y1 = comb[i]
        x2,y2 = comb[i+1]

        sub = sub_path(arr, x1, y1, x2, y2)

        score += sub - arr[x1-1][y1-1]

    xm,ym = comb[-1]

    score += d2[xm][ym] - arr[xm-1][ym-1]



    return score


def is_valid(comb, m):

    sorted_comb = sorted(comb, key=lambda point: (point[0], point[1]))

    for i in range(m-1):
        if sorted_comb[i][0] > sorted_comb[i+1][0]:
            return False

    for i in range(m-1):
        if sorted_comb[i][1] > sorted_comb[i+1][1]:
            return False

    return sorted_comb

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


valid_comb = is_valid(points, m)

print(matrix_path(arr, n, m, valid_comb))