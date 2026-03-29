import copy

def matrix_path2(m, a, b):  # (1, 1)에서 (n, n)에 이르는 최고 점수를 구한다.

    d = [[0] * (b+1) for _ in range(a+1)]
    cnt = 0

    for i in range(1, a+1):
        for j in range(1, b+1):
            d[i][j] = m[i-1][j-1] + max(d[i - 1][j], d[i][j - 1])
            cnt += 1

    return d[a][b]


n = int(input())

arr = []

for _ in range(n):
    row = list(map(int, input().split()))
    arr.append(row)

i, j = map(int, input().split())

sub_arr = [row[j-1:] for row in arr[i-1:]]
sub_arr[0][0] = 0

copy_arr = copy.deepcopy(arr)

if i-1 == 0:
    copy_arr[0][j-1:] = [0]* (len(copy_arr[0]) - (j-1))
elif j-1 == 0:
    for row in copy_arr[i-1:]:
        row[0] = 0
else:
    copy_arr[i-1][j-1] = -int(1e18)

print(f'{matrix_path2(arr, i, j) + matrix_path2(sub_arr, n-i+1, n-j+1)} {matrix_path2(copy_arr, n, n)}')
