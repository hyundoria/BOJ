from collections import deque

n, m = map(int, input().split())

r,c,d = map(int, input().split())

room = [list(map(int, input().split())) for _ in range(n)]

dxy = [[-1,0],[0,1],[1,0],[0,-1]]

def serch(r,c,d):

    cnt = 0

    while True:

        flag = False

        if room[r][c] == 0:
            room[r][c] = 2
            cnt += 1

        for i in range(4):

            nd = ((d + 3-i) % 4)
            nx = r + dxy[nd][0]
            ny = c + dxy[nd][1]

            if n > nx >= 0 and 0 <= ny < m and room[nx][ny] == 0:
                r,c,d = nx,ny,nd
                flag = True
                break

        if flag:
            continue

        back = (d+2)%4
        nx = r + dxy[back][0]
        ny = c + dxy[back][1]

        if nx < 0 or nx >= n or ny < 0 or ny >= m or room[nx][ny] == 1:
            return cnt
        else:
            r,c,d = nx, ny, d


print(serch(r,c,d))