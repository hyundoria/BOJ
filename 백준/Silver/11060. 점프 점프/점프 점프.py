from collections import deque

n = int(input())

graph = list(map(int, input().split()))

graph.insert(0, 0)

visited = [-1] * (n+1)

def bfs():

    q = deque([1])
    visited[1] = 0

    while q:

        idx = q.popleft()

        m = graph[idx]

        if idx + m > n:
            m = n - idx

        for i in range(1, m+1):
            if visited[i + idx] == -1:
                visited[i + idx] = visited[idx] + 1
                q.append(i + idx)

bfs()

print(visited[n])