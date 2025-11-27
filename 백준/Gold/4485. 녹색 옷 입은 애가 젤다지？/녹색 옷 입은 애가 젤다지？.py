import heapq
import sys
INF = sys.maxsize

def dijkstra(start, end):

    distance = [[INF] * v for _ in range(v)]

    heap = []

    heapq.heappush(heap, (graph[start[0]][start[1]], start))  # (가중치, 시작노드)

    distance[start[0]][start[1]] = graph[start[0]][start[1]]

    move = [[0,1],[1,0],[0,-1],[-1,0]]

    while heap:

        dist, node = heapq.heappop(heap)

        for dx,dy in move:
            nx = node[0] + dx
            ny = node[1] + dy

            if 0 <= nx < v and 0 <= ny < v:
                cost = dist + graph[nx][ny]

                if distance[node[0]][node[1]] < dist:
                    continue

                if cost < distance[nx][ny]:
                    distance[nx][ny] = cost
                    heapq.heappush(heap, (cost, (nx, ny)))

    return distance[end[0]][end[1]]

cnt = 1

while True:

    v = int(input())

    if v == 0:
        break

    graph = []

    for _ in range(v):
        g = list(map(int, input().split()))
        graph.append(g)

    print(f"Problem {cnt}: {dijkstra((0,0), (v-1,v-1))}")
    cnt += 1