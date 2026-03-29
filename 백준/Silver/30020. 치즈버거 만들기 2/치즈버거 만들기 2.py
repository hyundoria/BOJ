n, m = map(int, input().split())

p = int(n / 2)
q = n % 2
c = m - p

cnt = 0

while n > 0 and m > 0:

    if n > 1 and m > 0:
        n -= 2
        m -= 1
        cnt += 1

    if n == m == 0:
        print("YES")
        print(cnt)
        for i in range(cnt):
            print("aba")
        exit(0)

    elif n == m:

        print("YES")
        print(cnt)
        for i in range(cnt-1):
            print("aba")
        print("aba", end="")
        for i in range(m):
            print("ba", end="")
        exit(0)

    elif n == 0 and m == 1 and cnt > 0:

        print("YES")
        print(cnt-1)
        for i in range(cnt - 2):
            print("aba")
        m += 1
        print("aba", end="")
        for i in range(m):
            print("ba", end="")
        exit(0)

    if m > n:
        print("NO")
        exit(0)

print("NO")