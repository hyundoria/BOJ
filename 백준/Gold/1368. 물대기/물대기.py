import sys

v = int(input())

self = []

for i in range(v):
    self.append(int(input()))

graph = []

for _ in range(v):

    ar = list(map(int, input().split()))
    graph.append(ar)

self.insert(0,0)
graph.insert(0, self)

for i in range(1,v+1):
    graph[i].insert(0, self[i])

dist = [sys.maxsize] * (v+1)
visited = [False] * (v+1)

dist[0] = 0
total_cost = 0

for _ in range(v+1):

    min_cost = sys.maxsize
    curr_node = -1

    for i in range(v+1):

        if not visited[i] and dist[i] < min_cost:
            min_cost = dist[i]
            curr_node = i

    if curr_node == -1:
        break

    visited[curr_node] = True
    total_cost += min_cost

    for n in range(v+1):

        if not visited[n] and graph[curr_node][n] != 0:
            if graph[curr_node][n] < dist[n]:
                dist[n] = graph[curr_node][n]

print(total_cost)

