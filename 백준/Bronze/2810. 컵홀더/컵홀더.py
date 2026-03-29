n = int(input())

arr = input()

cntl = arr.count("L")

if cntl == 0:
    print(n)
else:
    print(f"{n - ((cntl/2) - 1):.0f}")



