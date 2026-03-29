C = int(input())

arr = [0 for i in range(3)]

while(C != 0):

    if C >= 300:
        C -= 300
        arr[0] += 1
    elif C >= 60:
        C -= 60
        arr[1] += 1
    elif C >= 10:
        C -= 10
        arr[2] += 1
    else:
        print(-1)
        exit()

for i in arr:
    print(i, end=' ')



