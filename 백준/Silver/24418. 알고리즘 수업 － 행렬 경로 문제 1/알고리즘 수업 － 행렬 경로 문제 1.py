import math

def matrix_path1(m, n):# (1, 1)에서 (n, n)에 이르는 최고 점수를 구한다.
    cnt = [0]
    result =  matrix_path_rec(m, n, n, cnt)
    print(int(cnt[0]/2) + 1)
    return result

def matrix_path_rec(m, i, j, cnt): # (1, 1)에서 (i, j)에 이르는 최고 점수를 구한다.
    cnt[0] += 1
    if i == 0 or j == 0:
        return 0
    else:
        return m[i-1][j-1] + max(matrix_path_rec(m, i-1, j, cnt), matrix_path_rec(m, i, j-1, cnt))


def matrix_path2(m, n):  # (1, 1)에서 (n, n)에 이르는 최고 점수를 구한다.

    d = [[0] * (n+1) for _ in range(n+1)]
    cnt = 0

    for i in range(1, n+1):
        for j in range(1, n+1):
            d[i][j] = m[i-1][j-1] + max(d[i - 1][j], d[i][j - 1])  # 코드2
            cnt += 1

    print(cnt)
    return d[n][n]


n = int(input())

arr = []

for _ in range(n):
    row = list(map(int, input().split()))
    arr.append(row)

print(f'{round(math.factorial(2*n) / (math.factorial(n)**2))} {n**2}')


