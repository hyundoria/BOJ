import heapq

def dijkstra(start, graph, n):

    distance = [float('inf')] * (n+1)
    distance[start] = 0

    q = [(0,start)]

    while q:

        dist, node = heapq.heappop(q)

        if node > d-1:
            return distance


        if graph[node] == []:
            
            next = node + 1
            cost = dist + 1

            if cost < distance[next]:
                distance[next] = cost
                heapq.heappush(q, (cost, next))
        else:
            for next, weight in graph[node]:
                cost = dist + weight

                if cost < distance[next]:
                    distance[next] = cost
                    heapq.heappush(q, (cost, next))
            
            next = node + 1
            cost = dist + 1

            if cost < distance[next]:
                distance[next] = cost
                heapq.heappush(q, (cost, next))

    return distance

n, d = map(int, input().split())

graph = [[] for _ in range(d+1)]

for _ in range(n):

    s,e,l = map(int, input().split())

    if e > d:
        continue

    graph[s].append((e,l))
    
dist = dijkstra(0, graph, d)
print(dist[d])