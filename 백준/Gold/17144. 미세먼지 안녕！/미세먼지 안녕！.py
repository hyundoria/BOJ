r,c,t = map(int, input().split())

room = []

ac = []

for i in range(r):
    row = list(map(int, input().split()))
    if row[0] == -1:
        ac.append([i,0])
    room.append(row)

def rotation(x,y,arr):

    ox,oy = x,y
    dxyup = [[0,-1], [-1,0], [0,1], [1,0]]
    dxydown = [[0,-1], [1,0], [0,1], [-1,0]]
    num = 1

    while True:

        x = x + dxyup[num][0]
        y = y + dxyup[num][1]

        dx = x + dxyup[num][0]
        dy = y + dxyup[num][1]

        if 0 <= dx <= ac[0][0] and 0 <= dy < c:

            if arr[dx][dy] == -1:
                arr[x][y] = 0
                break
            arr[x][y] = arr[dx][dy]
        else:
            num = (num+1) % 4
            dx = x + dxyup[num][0]
            dy = y + dxyup[num][1]
            arr[x][y] = arr[dx][dy]

    x = ox+1
    y = oy
    num = 1

    while True:
        x = x + dxydown[num][0]
        y = y + dxydown[num][1]

        dx = x + dxydown[num][0]
        dy = y + dxydown[num][1]

        if ac[1][0] <= dx < r and 0 <= dy < c:

            if arr[dx][dy] == -1:
                arr[x][y] = 0
                break
            arr[x][y] = arr[dx][dy]
        else:
            num = (num+1) % 4
            dx = x + dxydown[num][0]
            dy = y + dxydown[num][1]
            arr[x][y] = arr[dx][dy]

    return arr

def diffusion(arr):

    dxy = [[0,-1], [-1,0], [0,1], [1,0]]

    newarr = [[0] * c for _ in range(r)]

    for i in range(r):
        for j in range(c):

            if arr[i][j] == -1:
                newarr[i][j] = -1
                continue

            if arr[i][j] != 0:

                dust = int(arr[i][j] / 5)
                cnt = 0

                for dx, dy in dxy:
                    if 0 <= i+dx < r and 0 <= j+dy < c:

                        if arr[i+dx][j+dy] == -1:
                            continue
                        newarr[i+dx][j+dy] += dust
                        cnt += 1

                newarr[i][j] += arr[i][j] - (dust * cnt)
    return newarr

for _ in range(t):
    room = diffusion(room)
    room = rotation(ac[0][0], ac[0][1], room)
dust = 0

for row in room:
    dust += sum(row)

print(dust+2)