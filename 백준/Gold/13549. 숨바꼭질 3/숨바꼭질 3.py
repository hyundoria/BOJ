from collections import deque

def bfs(x):

    q = deque([x])
    visited[x] = 0

    while q:

        x = q.popleft()

        move = [x*2, x - 1, x + 1]

        for dx in move:

            if dx < 0 or dx >= len(visited):
                continue

            if visited[dx] == -1:

                if dx == x*2:
                    visited[dx] = visited[x]
                    q.append(dx)
                else:
                    visited[dx] = visited[x] + 1
                    q.append(dx)

                if dx == k:
                    return


n,k = map(int, input().split())

visited = [-1] * 100001

bfs(n)

print(visited[k])


