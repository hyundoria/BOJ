n,m = input().split()

cnt = 0

k = 0

while cnt < int(n):

    k += 1
    if str(k).find(m) == -1:
        cnt += 1

print(k)