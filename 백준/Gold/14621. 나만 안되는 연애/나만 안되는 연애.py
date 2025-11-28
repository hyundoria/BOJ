def union(x,y):

    a = find(x)
    b = find(y)

    if a < b:
        parent[b] = a
    else:
        parent[a] = b

def find(x):

    if x != parent[x]:
        return find(parent[x])
    return parent[x]

n,m = map(int, input().split())

parent = [i for i in range(n+1)]


s = list(input().split())
s.insert(0,0)

e = []

for _ in range(m):

    a,b,c = map(int, input().split())
    if s[a] == s[b]:
        continue
    e.append((a,b,c))

e.sort(key=lambda x:x[2])

mst_cost = 0
cnt = 1

for a,b,c in e:

    if find(a) != find(b):
        mst_cost += c
        cnt += 1
        union(a,b)

if cnt == n:
    print(mst_cost)
else:
    print(-1)
