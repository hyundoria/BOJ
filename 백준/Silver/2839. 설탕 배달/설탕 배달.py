n = int(input())

cnt3 = 0
cnt5 = 0

while(n != 0):

    if n % 5 == 0:
        cnt5 = n/5
        n = 0
    elif n >= 3:
        n -= 3
        cnt3 += 1
    else:
        print(-1)
        exit()

print(f"{cnt3 + cnt5:.0f}")
