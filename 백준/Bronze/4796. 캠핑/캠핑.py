n = 1

while(True):

    arr = [int(i) for i in input().split(" ")]

    sum = 0

    L = arr[0]
    P = arr[1]
    V = arr[2]

    while(V != 0):
        if V >= P:
            V -= P
            sum += L
        else:
            sum += min(V, L)
            V = 0

    if sum == 0:
        break
    else:
        print(f"Case {n}: {sum}")
        n += 1


