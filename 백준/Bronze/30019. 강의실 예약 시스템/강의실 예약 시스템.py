import sys

n,m = map(int, input().split())

arr = [0] * 200_001

for i in range(m):

    k,s,e = sys.stdin.readline().split()

    k,s,e = int(k), int(s), int(e)

    if arr[k] > s:
        print("NO")
    if arr[k] <= s:
        print("YES")
        arr[k] = e
