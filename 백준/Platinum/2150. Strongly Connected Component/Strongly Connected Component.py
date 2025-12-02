import sys
input = sys.stdin.readline

# 1. 입력 및 그래프 생성
V, E = map(int, input().split())
graph = [[] for _ in range(V + 1)]
r_graph = [[] for _ in range(V + 1)]

for _ in range(E):
    u, v = map(int, input().split())
    graph[u].append(v)
    r_graph[v].append(u)

# 2. 첫 번째 DFS: 위상 정렬 순서(종료 역순) 구하기 (Iterative)
visited = [False] * (V + 1)
stack = []

for i in range(1, V + 1):
    if not visited[i]:
        # (노드, 해당 노드의 이웃 iterator)를 스택에 저장
        dfs_stack = [(i, iter(graph[i]))]
        visited[i] = True

        while dfs_stack:
            parent, children = dfs_stack[-1]
            try:
                # 다음 이웃 가져오기
                child = next(children)
                if not visited[child]:
                    visited[child] = True
                    dfs_stack.append((child, iter(graph[child])))
            except StopIteration:
                # 더 이상 방문할 이웃이 없으면(종료 시점) 스택에서 빼고 결과에 추가
                dfs_stack.pop()
                stack.append(parent)

# 3. 두 번째 DFS: 역방향 그래프에서 SCC 추출 (Iterative)
visited = [False] * (V + 1)
ans = []

while stack:
    node = stack.pop()
    if not visited[node]:
        component = []
        # 일반적인 반복문 DFS
        temp_stack = [node]
        visited[node] = True

        while temp_stack:
            u = temp_stack.pop()
            component.append(u)
            for v in r_graph[u]:
                if not visited[v]:
                    visited[v] = True
                    temp_stack.append(v)

        ans.append(sorted(component))

# 4. 결과 출력
ans.sort()
print(len(ans))
for a in ans:
    print(*a, -1)