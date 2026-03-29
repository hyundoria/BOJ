n = int(input())

before = list(map(int, input().split()))
after = list(map(int, input().split()))

gap = 0

for i in range(n):
    gap += abs(before[i] - after[i])

print(int(gap/2))