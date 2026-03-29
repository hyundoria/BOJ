n = int(input())

tree = [[] for _ in range(n)]

t = list(map(int, input().split()))

r = int(input())

root = 0

for i in range(n):

    if t[i] == -1:
        root = i
        continue

    if t[i] == r or i == r:
        continue

    tree[t[i]].append(i)

visited = [False] * (n+1)

def dfs(x):

    cnt = 0

    if not tree[x]:
        return 1

    for child in tree[x]:

        if not visited[child]:
            visited[child] = True
            cnt += dfs(child)

    return cnt

if root == r:
    print(0)
else:
    print(dfs(root))

# for row in dp:
#     for r in row:
#         print(r, end=" ")
#     print()
