t = int(input())

prime = [True] * 1000001
prime[0] = prime[1] = False

for i in range(2, int(1000000 ** 0.5) + 1):
    if prime[i]:
        for j in range(i * i, 1000000 + 1, i):
            prime[j] = False

for _ in range(t):

    n = int(input())

    cnt = 0

    for i in range(2, int(n/2)+1):
        if not prime[i]:
            continue
        if prime[n - i]:
            cnt += 1


    print(cnt)


