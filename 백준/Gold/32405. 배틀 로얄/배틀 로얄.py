from collections import deque

n = int(input())

act = list(map(int, input().split()))
hp = list(map(int, input().split()))

q = deque()

for i in range(n):

    q.append([i+1, act[i], hp[i], 0, 0])

total_act = 0

while len(q) != 1:

    i, a, h, d, c = q.popleft()

    k = total_act - d  - c * a

    if h - k > 0:

        h -= k
        total_act += a
        d += k
        q.append([i,a,h,d,c+1])






print(q.pop()[0])
