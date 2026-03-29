C = int(input())

C = 1000 - C

sum = 0

while(C != 0):

    if C >= 500:
        C -= 500
        sum += 1
    elif C >= 100:
        C -= 100
        sum += 1
    elif C >= 50:
        C -= 50
        sum += 1
    elif C >= 10:
        C -= 10
        sum += 1
    elif C >= 5:
        C -= 5
        sum += 1
    elif C >= 1:
        C -= 1
        sum += 1

print(sum)


