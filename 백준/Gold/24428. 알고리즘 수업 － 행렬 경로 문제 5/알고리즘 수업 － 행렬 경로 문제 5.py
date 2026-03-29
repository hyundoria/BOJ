import itertools


def sub_path(m, n, sx, sy):

    dp = [[0] * (n+2) for _ in range(n+2)]

    for i in range(sx, n+1):
        for j in range(sy, n+1):
            dp[i][j] = m[i-1][j-1] + max(dp[i-1][j], dp[i][j-1])

    return dp

def matrix_path(m, n, comb, points):

    d1 = [[0] * (n+1) for _ in range(n+1)]
    d2 = [[0] * (n+2) for _ in range(n+2)]

    for i in range(1, n+1):
        for j in range(1, n+1):
            d1[i][j] = m[i-1][j-1] + max(d1[i - 1][j], d1[i][j - 1])

    for i in range(n, 0, -1):
        for j in range(n, 0, -1):
            d2[i][j] = m[i-1][j-1] + max(d2[i + 1][j], d2[i][j + 1])

    start_dp = {}

    for p in points:
        start_dp[p] = sub_path(m, n, p[0], p[1])

    max_score = -1

    for points in comb:

        p1, p2, p3 = points

        x1, y1 = p1
        x2, y2 = p2
        x3, y3 = p3

        sub1 = d1[x1][y1]
        sub2 = start_dp[p1][x2][y2]
        sub3 = start_dp[p2][x3][y3]
        #sub2 = sub_path(m, x1, y1, x2, y2)
        #sub3 = sub_path(m, x2, y2, x3, y3)
        sub4 = d2[x3][y3]

        score = sub1 + sub2 + sub3 + sub4 - m[x1-1][y1-1] - m[x2-1][y2-1] - m[x3-1][y3-1]
        max_score = max(score, max_score)

    return max_score

def is_valid(comb):

    sorted_comb = sorted(comb, key=lambda point: (point[0], point[1]))

    for i in range(2):
        if sorted_comb[i][0] > sorted_comb[i+1][0]:
            return False

    for i in range(2):
        if sorted_comb[i][1] > sorted_comb[i+1][1]:
            return False

    return sorted_comb

def find_valid_combinations(p):
    valid = []
    for com in itertools.combinations(p, 3):
        sorted_comb = is_valid(com)
        if sorted_comb:
            valid.append(sorted_comb)

    return  valid

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

valid_comb = find_valid_combinations(points)

print(matrix_path(arr, n, valid_comb, points))