import sys

input = sys.stdin.readline
sys.setrecursionlimit(10**6)

def dfs(v):

    global cnt

    visited[v] = True
    next = arr[v]

    if visited[next]:
        if not finished[next]:
            temp = next
            cnt += 1
            while temp != v:
                cnt += 1
                temp = arr[temp]
    else:
        dfs(next)
    
    finished[v] = True

t = int(input())

for _ in range(t):

    n = int(input())

    arr = [0] + list(map(int, input().split()))

    visited = [False] * (n+1)

    finished = [False] * (n+1)

    cnt = 0

    for i in range(1,n+1):

        if not visited[i]:
            dfs(i)


    print(n - cnt)
            


        