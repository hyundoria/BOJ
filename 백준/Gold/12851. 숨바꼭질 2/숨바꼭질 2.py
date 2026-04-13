from collections import deque


n,k = map(int, input().split())

q = deque()
q.append(n)

visited = [-1] * 100001
count = [0] * 100001
visited[n] = 0
count[n] = 1

cnt = 1

while q:

    x = q.popleft()

    move = [x-1,x+1,x*2]

    for dx in move:

        if 0 <= dx <= 100000:
            
            if visited[dx] == -1:
                    visited[dx] = visited[x] + 1
                    count[dx] = count[x]
                    q.append(dx)
            else:
                if visited[dx] == visited[x] + 1:
                    count[dx] += count[x]

print(visited[k])
print(count[k])