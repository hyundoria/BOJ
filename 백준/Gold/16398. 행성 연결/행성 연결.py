import sys

v = int(input())

graph = []

for _ in range(v):

    ar = list(map(int, input().split()))
    graph.append(ar)

dist = [sys.maxsize] * v
visited = [False] * v

dist[0] = 0
total_cost = 0

for _ in range(v):

    min_cost = sys.maxsize
    curr_node = -1

    for i in range(v):

        if not visited[i] and dist[i] < min_cost:
            min_cost = dist[i]
            curr_node = i

    if curr_node == -1:
        break

    visited[curr_node] = True
    total_cost += min_cost

    for n in range(v):

        if not visited[n] and graph[curr_node][n] != 0:
            if graph[curr_node][n] < dist[n]:
                dist[n] = graph[curr_node][n]

print(total_cost)

