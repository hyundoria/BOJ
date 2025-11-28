def union(x,y):

    a = find(x)
    b = find(y)

    if abs(parent[a][1]-parent[b][1]) == 1:
        if parent[a][1] < parent[b][1]:
            parent[b][0] = a
            parent[a][1] = 1
        else:
            parent[a][0] = b
            parent[b][1] = 1
        return True
    elif parent[a][1] == parent[b][1] == 0:
        if a < b:
            parent[b][0] = a
        else:
            parent[a][0] = b
        return True
    else:
        return False

def find(x):

    if x != parent[x][0]:
        return find(parent[x][0])
    return parent[x][0]

n,m,k = map(int, input().split())

parent = [[i,0] for i in range(n+1)]

power = list(map(int, input().split()))

for p in power:
    parent[p][1] = 1

e = []

for _ in range(m):

    a,b,c = map(int, input().split())
    e.append((a,b,c))

e.sort(key=lambda x:x[2])

mst_cost = 0

for a,b,c in e:

    if find(a) != find(b):
        if union(a,b):
            mst_cost += c

print(mst_cost)


