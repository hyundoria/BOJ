from collections import deque

n, m = map(int, input().split())

graph = [list(map(int, input().split())) for _ in range(m)]

visited = [[False] * n for _ in range(m)]

# 오른쪽 이동
dx = [1, 0]
# 아래쪽 이동
dy = [0, 1]


def bfs(x, y):
    q = deque()
    q.append([x, y])
    visited[x][y] = True

    while q:

        # 현재 위치
        x, y = q.popleft()

        # 현재 위치가 도착 위치(m,n)이면 도착
        if x == m-1 and y == n-1:
            return True

        # 오른쪽과 아래쪽 탐색
        for move in range(2):

            # 오른쪽과 아래쪽으로 이동시 좌표
            nx = x + dx[move]
            ny = y + dy[move]

            # 이동 가능 여부 판단
            if nx >= m or ny >= n or graph[nx][ny] == 0:
                continue


            # 방문 여부 갱신 및 큐에 이동 경로 저장
            if not visited[nx][ny]:
                visited[nx][ny] = True
                q.append([nx, ny])

    return False


if bfs(0, 0):
    print("Yes")
else:
    print("No")

