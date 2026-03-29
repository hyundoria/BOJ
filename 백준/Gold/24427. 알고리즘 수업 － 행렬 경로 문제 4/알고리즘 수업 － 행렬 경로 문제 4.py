def matrix_path2(m, a, b, p):  # (1, 1)에서 (n, n)에 이르는 최고 점수를 구한다.

    d1 = [[0] * (b+1) for _ in range(a+1)]
    d2 = [[0] * (b+2) for _ in range(a+2)]

    for i in range(1, a+1):
        for j in range(1, b+1):
            d1[i][j] = m[i-1][j-1] + max(d1[i - 1][j], d1[i][j - 1])

    for i in range(n, 0, -1):
        for j in range(n, 0, -1):
            d2[i][j] = m[i-1][j-1] + max(d2[i + 1][j], d2[i][j + 1])

    max_score = 0

    for r,c in p:
        score = d1[r][c] + d2[r][c] - m[r-1][c-1]
        max_score = max(score, max_score)

    return max_score

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

print(matrix_path2(arr,n,n,points))