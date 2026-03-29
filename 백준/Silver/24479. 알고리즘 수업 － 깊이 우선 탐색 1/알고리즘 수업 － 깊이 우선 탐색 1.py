n, m, r = map(int, input().split())

graph = [[] for _ in range(n + 1)]

for _ in range(m):
    u, v = map(int, input().split())
    graph[u].append(v)
    graph[v].append(u)

# 오름차순 정렬
for i in range(1, n + 1):
    graph[i].sort()

visited = [0] * (n + 1)
count = 1
stack = [r] # 시작 노드를 스택에 추가

while stack:
    node = stack.pop()

    if visited[node] == 0:
        visited[node] = count
        count += 1

        # 인접 노드를 역순으로 스택에 추가하여 DFS 순서 유지
        for neighbor in sorted(graph[node], reverse=True):
            if visited[neighbor] == 0:
                stack.append(neighbor)

for i in range(1, n + 1):
    print(visited[i])