import sys
import heapq

input = sys.stdin.readline

def dij(start):

    visited = [float('inf')] * (n+1)
    q = []
    for e in end:
        heapq.heappush(q, (0,e))
        visited[e] = 0


    while q:
        
        c_w, c_n = heapq.heappop(q)

        if visited[c_n] < c_w:
            continue
            
        for n_n, n_w in graph[c_n].items():

            cost = c_w + n_w

            if visited[n_n] > cost:
                visited[n_n] = cost
                heapq.heappush(q,(cost,n_n))

    return visited


n,m,k = map(int, input().split())

graph = {i : {} for i in range(n+1)}

for _ in range(m):
    u,v,c = map(int, input().split())

    graph[v][u] = c

end = list(map(int, input().split()))

end.sort()

dist = dij(end)

long = 0
loc = 0

for i in range(1,n+1):

    if dist[i] == 0:
        continue

    if long < dist[i]:
        long = dist[i]
        loc = i

print(loc)
print(long)


