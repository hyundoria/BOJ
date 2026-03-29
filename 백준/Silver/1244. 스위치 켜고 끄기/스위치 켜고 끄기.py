n = int(input())

light = list(map(int, input().split()))

light.insert(0, 0)

student = int(input())

for _ in range(student):

    gender, num = map(int, input().split())

    if gender == 1:
        for i in range(num, n+1):
            if i % num == 0:
                light[i] = 1 - light[i]
    else:
        length = min(n - num, num - 1)
        light[num] = 1 - light[num]
        for i in range(1, length + 1):
            if light[num + i] == light[num - i]:
                light[num + i] = 1 - light[num + i]
                light[num - i] = 1 - light[num - i]
            else:
                break


for i in range(1, n+1):
    print(light[i], end=' ')
    if i % 20 == 0:
        print()
