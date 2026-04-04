import heapq

def dij(start):

    distance = [1000000000] * (n+1)
    distance[start] = 0

    q = [(0,start)]

    while q:
        
        w, node = heapq.heappop(q)

        if distance[node] < w:
            continue
            
        for next, weight in graph[node]:

            cost = w + weight

            if distance[next] > cost:
                distance[next] = cost
                heapq.heappush(q, (cost,next))

    return distance


T = int(input())

for _ in range(T):

    n,m,t = map(int, input().split())

    s,g,h = map(int, input().split())

    graph = [[] for _ in range(n+1)]

    start_weight = 0

    for _ in range(m):

        a,b,d = map(int, input().split())

        if (g,h) == (a,b) or (g,h) == (b,a):
            start_weight = d
        
        graph[a].append((b,d))
        graph[b].append((a,d))

    end = []

    for _ in range(t):
        end.append(int(input()))

    end.sort()

    dist = dij(s)
    dist1 = dij(min(g,h))
    dist2= dij(max(h,g))

    # print(dist)

    # print("_______________")

    # print(dist1)

    # print("_______________")

    # print(dist2)


    for e in end:

        if dist[e] == dist[min(g,h)] + dist1[max(g,h)] + dist2[e] or dist[e] == dist[max(g,h)] +dist2[min(g,h)] + dist1[e] :

            print(e, end=" ")

    print()


