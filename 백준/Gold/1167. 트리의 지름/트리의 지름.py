import sys

sys.setrecursionlimit(10**6)


n = int(input())

graph = [[] for _ in range(n+1)]

for _ in range(1, n+1):

    arr = list(map(int, input().split()))
    i = arr[0]
    arr = arr[1:len(arr)-1]
    
    for j in range(0,len(arr),2):
        graph[i].append((arr[j],arr[j+1]))


visited = [-1] * (n+1)

def dfs(node, w):

    for next, weight in graph[node]:

        if visited[next] == -1:
            visited[next] = weight + visited[node]
            dfs(next, weight)

visited[1] = 0
dfs(1,0)

start = visited.index(max(visited))

visited = [-1] * (n+1)

visited[start] = 0
dfs(start,0)
print(visited[visited.index(max(visited))])

