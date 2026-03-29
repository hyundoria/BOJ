n = int(input())

arr = list(map(int, input().split()))

arr. sort()

x = int(input())

ans = 0

left = 0
right = n-1

while left != right:

    if arr[left] + arr[right] > x:
        right -= 1
    elif arr[left] + arr[right] < x:
        left += 1
    else:
        ans += 1
        left += 1

print(ans)

