n = int(input())

arr = list(map(int, input().split()))

stack = []

cnt = 1

for i in range(2*n+1):

    if len(arr) == len(stack) == 0:
        break

    if len(arr) > 0 and arr[0] == cnt:
        cnt += 1
        arr = arr[1:len(arr)]
    elif len(stack) > 0 and stack[len(stack)-1] == cnt:
        stack.pop()
        cnt += 1
        continue
    else:
        if len(arr) > 0:
            stack.append(arr[0])
            arr = arr[1:len(arr)]

if len(stack) == len(arr) == 0:
    print("Nice")
else:
    print("Sad")


