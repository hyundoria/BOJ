import sys

input = sys.stdin.readline

n,m,b = map(int, input().split())

arr = []

block = [0] * 257

maxi = -1
mini = 257

for _ in range(n):
    k = (list(map(int, input().split())))
    for i in k:
        block[i] += 1

        if maxi < i:
            maxi = i
        if mini > i:
            mini = i
    arr.append(k)

ans = [128000000,0]

for high in range(mini, maxi+1):

    inven = b
    time = 0

    for i in range(maxi+1):

        if block[i] != 0:

            if i < high:
                time += (high-i) * block[i]
                inven -= (high-i) * block[i]
            if i > high:
                time += ((i-high) * 2) * block[i]
                inven += (i - high) * block[i]


    if inven >= 0:

        if ans[0] >= time:
            ans[0] = time
            ans[1] = high


print(ans[0], ans[1])


