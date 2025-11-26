import math


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

position =[]
e = []

for i in range(n):
    a,b = map(int,input().split())
    position.append((a,b))

for i in range(n):
    for j in range(i, n):

        c = math.sqrt(abs(position[i][0]-position[j][0])**2 + abs(position[i][1]-position[j][1])**2)

        e.append((i+1,j+1,c))

for i in range(m):
   a,b = map(int,input().split())
   union(a,b)


e.sort(key = lambda x:x[2])

total_cost = 0

for a, b, cost in e:

    if find(a) != find(b):
        union(a,b)
        total_cost += cost

print(f"{total_cost:.2f}")
