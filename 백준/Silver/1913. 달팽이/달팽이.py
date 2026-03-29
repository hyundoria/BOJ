n = int(input())
m = int(input())

arr = [[0] * n for _ in range(n)]

move = [[-1, 0], [0, -1], [1, 0], [0, 1]]

direction = 2

num = n**2

x, y = 0, 0

px, py = 0, 0

while num != 0:

    if num == m:
        px, py = x, y

    arr[x][y] = num
    num -= 1

    nx = x + move[direction][0]
    ny = y + move[direction][1]

    if nx < 0 or nx >= n or ny < 0 or ny >= n or arr[nx][ny] != 0:
        direction = (direction + 1) % 4
        nx = x + move[direction][0]
        ny = y + move[direction][1]

    x, y = nx, ny

for row in arr:
    for i in row:
        print(i, end=" ")
    print()

print(px+1, py+1)



