import heapq
import sys

INF = sys.maxsize

v,e,end = map(int, input().split())

graph = [[] for _ in range(v + 1)]


for _ in range(e):
    a, b, c = map(int, input().split())
    graph[a].append((c, b))

max_dist = 0


re = [INF] * (v + 1)

heap = []

heapq.heappush(heap, (0, end))  # (가중치, 시작노드)

re[end] = 0

while heap:

    dist, node = heapq.heappop(heap)

    if re[node] < dist:
        continue

    for i in graph[node]:
        cost = dist + i[0]

        if cost < re[i[1]]:
            re[i[1]] = cost
            heapq.heappush(heap, (cost, i[1]))


for start in range(1,v+1):

    distance = [INF] * (v + 1)

    heap = []

    heapq.heappush(heap, (0, start))  # (가중치, 시작노드)
    distance[start] = 0

    while heap:

        dist, node = heapq.heappop(heap)

        if distance[node] < dist:
            continue

        for i in graph[node]:
            cost = dist + i[0]

            if cost < distance[i[1]]:
                distance[i[1]] = cost
                heapq.heappush(heap, (cost, i[1]))

    max_dist = max(max_dist, distance[end]+re[start])

print(max_dist)
