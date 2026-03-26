from collections import deque

n, m = map(int, input().split())

graph = [[] for _ in range(n+1)]

for i in range(m):
    a, b = map(int, input().split())
    graph[b].append(a)

def dfs(arr, start):

    visited = [False] * (n+1)

    q = deque()
    q.append(start)
    visited[start] = True

    cnt = 0

    while q:

        node = q.pop()

        for next in arr[node]:
            

            if not visited[next]:

                cnt += 1
                q.append(next)
                visited[next] = True

    return cnt


result = []
max = 0 

for i in range(1, n+1):
    re = dfs(graph, i)

    if re > max:
        result.clear()
        result.append(i)
        max = re
    elif re == max:
        result.append(i)


result.sort()

for i in result:
    print(i, end=" ")

