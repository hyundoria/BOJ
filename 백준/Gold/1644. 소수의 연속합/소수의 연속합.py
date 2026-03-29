n = int(input())

a = [False, False] + [True] * (n-1)
primes = []

for i in range(2, n+1):
    if a[i]:
        primes.append(i)
        for j in range(i*2, n+1, i):
            a[j] = False

start = 0
cnt = 0
ans = 0

for end in range(0, len(primes)):

    ans += primes[end]

    if ans == n:
        cnt += 1

    while ans >= n and start < end:

        ans -= primes[start]
        start += 1

        if ans == n:
            cnt += 1
            break

print(cnt)