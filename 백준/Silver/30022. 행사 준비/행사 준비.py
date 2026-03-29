n, a, b = map(int, input().split())

arr = []

for _ in range(n):
    arr.append(list(map(int, input().split())))

arr.sort(key=lambda x: -abs(x[1]-x[0]))

val = 0

for i in range(n):

    if a == 0:
        val += arr[i][1]
    elif b == 0:
        val += arr[i][0]
    else:

        if arr[i][1] > arr[i][0]:
            val += arr[i][0]
            a -= 1
        elif arr[i][0] > arr[i][1]:
            val += arr[i][1]
            b -= 1
        else:
            val += arr[i][0]
            if a > b:
                a -= 1
            else:
                b -= 1

print(val)