import heapq
import sys
INF = sys.maxsize

def dijkstra(start, end):

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

    return distance[end]

v,e = map(int, input().split())

graph = [[] for _ in range(v + 1)]

for _ in range(e):
    a, b, c = map(int, input().split())
    graph[a].append((c, b))
    graph[b].append((c, a))

m1, m2 = map(int, input().split())

c = dijkstra(1, m1) + dijkstra(m1, m2) + dijkstra(m2, v)
d = dijkstra(1, m2) + dijkstra(m2, m1) + dijkstra(m1, v)


if min(c,d) < INF:
    print(min(c,d))
else:
    print(-1)