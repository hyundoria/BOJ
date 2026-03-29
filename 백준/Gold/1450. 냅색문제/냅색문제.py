import bisect

n,c = map(int, input().split())

arr = list(map(int, input().split()))

arra = [0]
arrb = [0]

for i in range(int(n/2)):
    for j in range(len(arra)):
        arra.append(arr[i] + arra[j])

for i in range(int(n/2),n):
    for j in range(len(arrb)):
        arrb.append(arr[i] + arrb[j])

arra.sort()
arrb.sort()

ans = 0

for i in arra:

    s = c-i
    ans += bisect.bisect_right(arrb, s)

# print(arra, arrb)
print(ans)

