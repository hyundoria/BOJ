import sys
sys.setrecursionlimit(10**6)


def dfs(node, current_sum):

    for next, w in graph[node]:

        if visited[next] == -1:
            visited[next] = current_sum + w
            dfs(next, visited[next])

    

n = int(input())

graph = [[] for _ in range(n+1)]


for _ in range(n-1):

    parent, child, weight = map(int, input().split())

    graph[parent].append((child, weight))
    graph[child].append((parent, weight))

visited = [-1] * (n+1)


visited[1] = 0
dfs(1, visited[1])

next = visited.index(max(visited))

visited = [-1] * (n+1)

visited[next] = 0
dfs(next, visited[next])

print(max(visited))
    