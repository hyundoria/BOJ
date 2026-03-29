import sys

input = sys.stdin.readline

s = 0

t = int(input())

for _ in range(t):

    cmm = input().split()
    st = cmm[0]

    if st == 'all':
        s = (1 << 20) - 1
    elif st == 'empty':
        s = 0
    else:

        x = int(cmm[1])

        if st == 'add':
            s |= (1 << (x - 1))
        if st == 'remove':
            s &= ~(1 << (x - 1))
        if st == 'check':
            if s & (1 << (x - 1)):
                print(1)
            else:
                print(0)
        if st == 'toggle':
            s ^= (1 << (x - 1))




