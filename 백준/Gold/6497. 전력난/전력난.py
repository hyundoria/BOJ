import sys

def union(x,y):

    a = find(x)
    b = find(y)
    if a < b:
        parent[b] = a
    else:
        parent[a] = b

def find(x):

    if parent[x] != x:
        return find(parent[x])
    return x

while True:

    n,m = map(int,input().split())

    if n == m == 0:
        break

    parent = [i for i in range(n+1)]

    e = []

    max_cost = 0

    for i in range(m):

       a,b,c = map(int,input().split())
       max_cost += c
       e.append((a,b,c))

    e.sort(key = lambda x:x[2])

    total_cost = 0

    for a, b, cost in e:

        if find(a) != find(b):
            union(a,b)
            total_cost += cost

    print(max_cost-total_cost)
