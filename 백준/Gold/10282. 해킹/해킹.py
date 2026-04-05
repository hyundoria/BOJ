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

    n,d,c = map(int, input().split())

    graph = [[] for _ in range(n+1)]

    start_weight = 0

    for _ in range(d):

        a,b,s = map(int, input().split())
        graph[b].append((a,s))

    dist = dij(c)

    m = 0
    cnt = 0

    for di in dist:
        
        if di != 1000000000:
            cnt += 1
            if di > m:
                m = di
    
    print(cnt, m)
