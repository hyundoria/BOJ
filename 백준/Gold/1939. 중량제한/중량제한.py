import heapq


def dij(start, end, graph):

    visited = [0] * (n+1)

    q = [(-1000000001,start)]

    while q:

        w, node = heapq.heappop(q)
        w = -w

        if node == end:
            return w

        for next, weight in graph[node]:

            cost = min(w, weight)

            if visited[next] < cost:
                visited[next] = cost
                heapq.heappush(q, (-cost, next))

    



n,m = map(int, input().split())

grpah= [[] for _ in range(n+1)]

for _  in range(m):
    a,b,c = map(int, input().split())
    grpah[a].append((b,c))
    grpah[b].append((a,c))

start,end = map(int, input().split())

print(dij(start, end,grpah))