import heapq

def dij(start, d):

    distance = [float('inf')] * (n+1)
    distance[start] = 0


    q = [(d,start)]

    while q:

        w, node = heapq.heappop(q)

        if distance[node] < w:
            continue
            
        for next, weight in graph[node]:

            cost = w + weight

            if distance[next] > cost:
                distance[next] = cost
                heapq.heappush(q, (cost,next))

    return(distance)


n,m = map(int, input().split())

graph = [[] for _ in range(n+1)]

for _ in range(m):

    a,b,c = map(int, input().split())

    graph[a].append((b,c))
    graph[b].append((a,c))

print(dij(1,0)[n])
