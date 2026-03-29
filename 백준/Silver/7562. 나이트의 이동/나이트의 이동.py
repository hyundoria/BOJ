from collections import deque

def bfs(x,y):

    q = deque()
    q.append((x,y))
    board[x][y] = 0

    while q:

        x, y = q.popleft()

        move = [[1, -2], [2,-1], [2, 1], [1, 2], [-1, 2], [-2, 1], [-2,-1], [-1, -2]]

        for dx,dy in move:

            nx = x + dx
            ny = y + dy


            if nx < 0 or nx >= l or ny < 0 or ny >= l:
                continue

            if board[nx][ny] == -1:
                board[nx][ny] = board[x][y] + 1
                if nx == i and ny == j:
                    return
                q.append((nx,ny))


t = int(input())

for _ in range(t):

    l = int(input())

    board = [[-1] * l for _ in range(l)]

    a, b = map(int, input().split())

    i, j = map(int, input().split())

    bfs(a,b)
    print(board[i][j])



