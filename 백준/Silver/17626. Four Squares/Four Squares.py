import math

n = int(input())

dp = [0] * (n+1)

dp[1] = 1

for i in range(2, n+1):

    k = math.sqrt(i)
    if i == int(k) * int(k):
        dp[i] = 1
        continue

    mi = 10
    for j in range(1, int(k)+1):
        t = j*j
        mi = min(dp[t] + dp[i-t], mi)
        if mi == 2:
            break
    dp[i] = mi

print(dp[n])