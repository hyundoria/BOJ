n = int(input())

bro1 = list(map(int, input().split()))
bro2 = list(map(int, input().split()))

bro_max = False

if bro1[n-1] + bro2[n-2] > bro2[n-1] + bro1[n-2]:
    bro_max = True

for i in range(n-2):

    if bro_max:
        bro1[n-1] += max(bro1[i], bro2[i])
        bro2[n-1] += min(bro1[i], bro2[i])
    else:
        bro2[n-1] += max(bro1[i], bro2[i])
        bro1[n-1] += min(bro1[i], bro2[i])

bro1[n-1] += bro2[n-2]
bro2[n-1] += bro1[n-2]

print(abs(bro1[n-1] - bro2[n-1]))



