from collections import deque

n, m = map(int, input().split())

board = [[] for _ in range(101)]


for i in range(1, 101):
    for j in range(1,7):
        if i+j > 100:
            break
        board[i].append(i+j)

for _ in range(n):
    x,y = map(int, input().split())
    board[x] = [y]

for _ in range(m):
    x, y = map(int, input().split())
    board[x] = [y]

visited = [False] * 101

def bfs():

    q = deque()
    q.append([1, 0])
    visited[1] = True

    while q:

        k, cnt = q.popleft()

        for i in board[k]:

            if i == 100:
                return cnt+1

            elif not visited[i]:
                visited[i] = True

                if len(board[i]) == 1:
                    q.append([board[i][0], cnt+1])
                else:
                    q.append([i, cnt+1])

print(bfs())