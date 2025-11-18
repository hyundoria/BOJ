import heapq

v, e = map(int, input().split())

graph = [[] for _ in range(v + 1)]
visited = [False] * (v + 1)

for _ in range(e):
    a, b, c = map(int, input().split())
    graph[a].append((c, b))
    graph[b].append((c, a))

heap = []

heapq.heappush(heap, (0, 1))  # (가중치, 시작노드)

ans = 0
cnt = 0

while heap:
    if cnt == v:
        break

    weight, node = heapq.heappop(heap)

    if visited[node]:
        continue

    visited[node] = True
    ans += weight
    cnt += 1

    # 연결된 노드 탐색
    for next_w, next_node in graph[node]:
        if not visited[next_node]:
            heapq.heappush(heap, (next_w, next_node))

print(ans)