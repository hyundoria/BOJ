n = int(input())

arr = [int(i) for i in input().split(" ")]

arr.sort()

sum = 0

for i in range(len(arr)):
    sum += int(arr[i]) * (len(arr) - i)

print(sum)
