from collections import deque

a,k = map(int, input().split())

# 방문 여부 체크
visited = [False] * (k+1)

def bfs():

    # a에 연산1과 연산2를 한 값을 초기 큐에 넣는다.
    q = deque([(a+1, 1), (a*2, 1)])

    while q:

        n, cnt = q.popleft()

        # k를 만들었을 경우 횟수 리턴
        if n == k:
            return cnt

        # 연산 1, 연산 2
        cal1 = n+1
        cal2 = n*2

        if cal1 <= k and not visited[cal1]:
            visited[cal1] = True
            q.append((cal1, cnt + 1))
        if cal2 <= k and not visited[cal2]:
            visited[cal2] = True
            q.append((cal2, cnt + 1))



print(bfs())
