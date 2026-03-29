from collections import deque

def bfs(x):

    q = deque([x])
    visited[x] = 0

    while q:

        x = q.popleft()

        up = x + u
        down = x - d

        move = [up, down]

        for dx in move:

            if dx > f or dx <= 0:
                continue

            if visited[dx] == -1:
                visited[dx] = visited[x] + 1
                q.append(dx)


f, s, g, u, d = map(int, input().split())

visited = [-1] * (f+1)

bfs(s)

if visited[g] == -1:
    print("use the stairs")
else:
    print(visited[g])






