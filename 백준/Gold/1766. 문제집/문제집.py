import heapq

n, m = map(int, input().split())

graph = [[] for _ in range(n + 1)]
e = [0] * (n + 1)

for _ in range(m):
    a, b = map(int, input().split())
    graph[a].append(b)
    e[b] += 1

q = []

for i in range(1, n + 1):

    if e[i] == 0:
        heapq.heappush(q, i)

ans = []

while q:

    node = heapq.heappop(q)
    ans.append(node)

    for i in graph[node]:
        e[i] -= 1
        if e[i] == 0:
            heapq.heappush(q, i)

for i in ans:
    print(i, end=" ")


