from collections import deque

def bfs(x):

    q = deque([x])
    visited[x] = 0

    while q:

        x = q.popleft()

        move = [x + 1, x - 1, x * 2]

        for dx in move:

            if dx < 0 or dx >= len(visited):
                continue

            if visited[dx] == -1:
                visited[dx] = visited[x] + 1
                if dx == k:
                    return
                q.append(dx)


n,k = map(int, input().split())

visited = [-1] * 100001

bfs(n)

print(visited[k])
navi = []
navi.append(k)

while True:

    if k == n:
        for _ in navi[::-1]:
            print(_, end=" ")
        break

    odd = [k + 1, k - 1]
    even = [k + 1, k - 1, k / 2]

    if k % 2 == 0:
        for dk in even:

            dk = int(dk)

            if dk < 0 or dk >= len(visited):
                continue

            if visited[k] - visited[dk] == 1:
                k = dk
                navi.append(k)

            if k == n:
                for _ in navi[::-1]:
                    print(_, end=" ")
                exit(0)
    else:
        for dk in odd:

            if dk < 0 or dk >= len(visited):
                continue

            if visited[k] - visited[dk] == 1:
                k = dk
                navi.append(k)
                if k == n:
                    for _ in navi[::-1]:
                        print(_, end=" ")
                    exit(0)
