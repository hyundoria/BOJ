import heapq
import sys

INF = sys.maxsize

v = int(input())
e = int(input())

graph = [[] for _ in range(v + 1)]

distance = [INF] * (v + 1)

for _ in range(e):
    a, b, c = map(int, input().split())
    graph[a].append((c, b))

heap = []

start, end = map(int, input().split())

heapq.heappush(heap, (0, start))  # (가중치, 시작노드)
distance[start] = 0

root = [i for i in range(v+1)]

while heap:

    dist, node = heapq.heappop(heap)

    if distance[node] < dist:
        continue

    for i in graph[node]:
        cost = dist + i[0]

        if cost < distance[i[1]]:
            root[i[1]] = node
            distance[i[1]] = cost
            heapq.heappush(heap, (cost, i[1]))

print(distance[end])

arr = [end]

while True:

    k = root[end]

    if k == end:
        break
    else:
        arr.append(k)

    end = k

print(len(arr))
while arr:
    print(arr.pop(), end=" ")