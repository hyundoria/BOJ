from collections import deque


def bfs():

    q = deque()


    for i in range(n):
        for j in range(m):
            if board[i][j] == '@':
                visited[i][j] = 1
                if i == 0 or i == n - 1 or j == 0 or j == m - 1:
                    return visited[i][j]
                q.append((i, j))
            if board[i][j] == '*':
                q.appendleft((i, j))
                visited[i][j] = 0

    move = [[0,1],[0,-1],[1,0],[-1,0]]

    while q:

        x, y = q.popleft()

        if board[x][y] == '*':

            for dx, dy in move:

                nx = x + dx
                ny = y + dy

                if nx < 0 or nx >= n or ny < 0 or ny >= m:
                    continue

                if visited[nx][ny] == -1 and board[nx][ny] == '.':
                    visited[nx][ny] = 0
                    board[nx][ny] = board[x][y]
                    q.append((nx, ny))

        if board[x][y] == '@':

            for dx, dy in move:

                nx = x + dx
                ny = y + dy

                if nx < 0 or nx >= n or ny < 0 or ny >= m:
                    continue

                if visited[nx][ny] == -1 and board[nx][ny] == '.':
                    visited[nx][ny] = visited[x][y] + 1

                    if nx == 0 or nx == n - 1 or ny == 0 or ny == m - 1:
                        return visited[nx][ny]

                    board[nx][ny] = board[x][y]
                    q.append((nx, ny))

            board[x][y] = '.'

        '''
        for row in board:
            print(row)
        print()
        '''
    return -1

t = int(input())

for _ in range(t):

    m, n = map(int, input().split())

    board = []

    for _ in range(n):
        row = list(input())
        board.append(row)

    visited = [[-1] * m for _ in range(n)]

    possible = bfs()

    if possible == -1:
        print("IMPOSSIBLE")
    else:
        print(possible)
