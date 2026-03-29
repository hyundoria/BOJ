t = int(input())

for _ in range(t):

    n = int(input())

    stop = False

    while True:

        root = int(n ** 0.5)

        if n <= 2:
            print(2)
            break
        if n == 3:
            print(3)
            break

        for i in range(2, root+1):
            if n % i == 0:
                n += 1
                break
            if i == root:
                stop = True
                print(n)
                break


        if stop:
            break



