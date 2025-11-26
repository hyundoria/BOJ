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


n = int(input())

parent = [i for i in range(n+1)]

position =[]
e = []

for i in range(n):
    a,b,c = map(float,input().split())
    position.append((i+1,a,b,c))

position.sort(key=lambda x:x[1])

for i in range(n-1):
    e.append((position[i][0], position[i+1][0], abs(position[i][1]-position[i+1][1])))

position.sort(key=lambda x:x[2])

for i in range(n-1):
    e.append((position[i][0], position[i+1][0], abs(position[i][2]-position[i+1][2])))

position.sort(key=lambda x:x[3])

for i in range(n-1):
    e.append((position[i][0], position[i+1][0], abs(position[i][3]-position[i+1][3])))

total_cost = 0
e.sort(key=lambda x:x[2])

for a, b, cost in e:

    if find(a) != find(b):
        union(a,b)
        total_cost += cost

print(round(total_cost))
