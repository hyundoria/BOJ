import sys

input = sys.stdin.readline
sys.setrecursionlimit(10**6)

def dfs(node):

    global result

    visited[node] = True
    next = arr[node]
    path.append(node)

    if visited[next]:
        if next in path:
            result += path[path.index(next):]
            return
    else:
        dfs(next)

t = int(input())

for _ in range(t):

    n = int(input())

    arr = list(map(int, input().split()))
    arr.insert(0,0)

    visited = [False] * (n+1)
    result = []

    for i in range(1,n+1):

        path = []
        
        if not visited[i]:
            dfs(i)


    print(n-len(result))
        