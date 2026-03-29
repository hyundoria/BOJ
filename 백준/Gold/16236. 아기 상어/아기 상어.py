from collections import deque

n = int(input())

under_the_sea = [list(map(int, input().split())) for _ in range(n)]

def bfs():

    baby_shark = ()
    time = 0
    shark = 2
    shark_eat = 0

    move = [(-1, 0), (0, -1), (1, 0) ,(0, 1)]


    for i in range(n):
        for j in range(n):
            if under_the_sea[i][j] == 9:
                baby_shark = (i, j)

    while True:

        q = deque()
        q.append((baby_shark[0], baby_shark[1], 0))
        visited = [[False] * n for _ in range(n)]
        visited[baby_shark[0]][baby_shark[1]] = True
        under_the_sea[baby_shark[0]][baby_shark[1]] = 0


        prey = []
        min_dist = float('inf')

        while q:

            i, j, dist = q.popleft()

            if prey and dist >= min_dist:
                continue

            for dx, dy in move:
                nx = i + dx
                ny = j + dy

                if 0 <= nx < n and 0 <= ny < n and not visited[nx][ny] and under_the_sea[nx][ny] <= shark:

                    visited[nx][ny] = True

                    if 0 < under_the_sea[nx][ny] < shark:

                        if not prey:
                            min_dist = dist + 1
                        if dist + 1 == min_dist:
                            prey.append((dist+1, nx, ny))
                    q.append((nx, ny, dist + 1))

        if not prey:
            return time

        prey.sort()

        d, r, c = prey[0]

        baby_shark = (r, c)
        under_the_sea[r][c] = 9
        time += d
        shark_eat += 1

        if shark_eat == shark:
            shark += 1
            shark_eat = 0

print(bfs())


