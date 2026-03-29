
import heapq

n = int(input())

arr = []
for i in range(n):

    heapq.heappush(arr, int(input()))

cnt = 0

while(1 != len(arr)):

    a = heapq.heappop(arr)
    b = heapq.heappop(arr)

    cnt += a+b

    heapq.heappush(arr, a+b)

print(cnt)
