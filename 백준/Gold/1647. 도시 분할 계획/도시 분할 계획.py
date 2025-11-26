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

n,m = map(int,input().split())

parent = [i for i in range(n+1)]

e = []

for i in range(m):

   a,b,c = map(int,input().split())
   e.append((a,b,c))

e.sort(key = lambda x:x[2])

total_cost = 0
max_cost = 0

for a, b, cost in e:

    if find(a) != find(b):
        union(a,b)
        max_cost = max(max_cost, cost)
        total_cost += cost

print(total_cost-max_cost)
