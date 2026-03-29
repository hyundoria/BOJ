from collections import deque

n,m = map(int, input().split())

graph = [[] for _ in range(n+1)]
e = [0] * (n+1)

for _ in range(m):
    a,b = map(int, input().split())
    graph[a].append(b)
    e[b] += 1

q = deque()

for i in range(1,n+1):

    if e[i] == 0:
        q.append(i)

ans = []

while q:

    node = q.popleft()
    ans.append(node)

    for i in graph[node]:
        e[i] -= 1
        if e[i] == 0:
            q.append(i)



for i in ans:
    print(i, end=" ")

