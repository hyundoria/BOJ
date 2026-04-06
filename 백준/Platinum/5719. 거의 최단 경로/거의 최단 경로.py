from collections import deque
import heapq
import sys

input = sys.stdin.readline


def dij(start):

    distance = [1000000000] * (n)
    distance[start] = 0

    q = [(0,start)]

    route = [[] for _ in range(n)]
    route[start] = [-1]

    while q:
        
        w, node = heapq.heappop(q)

        if distance[node] < w:
            continue
            
        for next, weight in graph[node].items():

            cost = w + weight

            if distance[next] > cost:
                distance[next] = cost
                route[next].clear()
                route[next].append(node)
                heapq.heappush(q, (cost,next))

            elif distance[next] == cost:
                route[next].append(node)

    return distance, route


while True:

    n,m = map(int, input().split())

    if n == m == 0:
        break

    s,d = map(int, input().split())

    graph = {i : {} for i in range(n)}

    for _ in range(m):

        u,v,p = map(int, input().split())
        graph[u][v] = p

    dist, route = dij(s)
    q = deque()

    for t in route[d]:
        q.append((t,d))

    visited = set()
    visited.add(d)

    while q:

        curr_s, curr_d = q.popleft()

        if curr_s == -1:
            continue

        if curr_s in graph and curr_d in graph[curr_s]:
            del graph[curr_s][curr_d]    
        
        if curr_s not in visited:
            for t in route[curr_s]:
                q.append((t,curr_s))
            visited.add(curr_s)
    
    dist, route = dij(s)

    if dist[d] == 1000000000:
        print(-1)
    else:
        print(dist[d])

