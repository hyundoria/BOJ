n = int(input())

for _ in range(n):

    m = int(input())

    arr = []
    for _ in range(m):
        arr.append(input())

    flag = True

    for i in range(m):
        if not flag:
            break
        for j in range(i+1,m):

            if not flag:
                break

            ans1 = arr[i] + arr[j]
            ans2 = arr[j] + arr[i]
            if ans1 == ans1[::-1]:
                print(ans1)
                flag = False
            elif ans2 == ans2[::-1]:
                print(ans2)
                flag = False
    
    if flag:
        print(0)