n = int(input())

g = 0

# d=1부터 n까지
for d in range(1, n + 1):
    # 약수 d가 n 이하에 (n // d)번 등장하므로,
    # 총합 g에 d * (n // d) 만큼 기여
    g += d * (n // d)

print(g)