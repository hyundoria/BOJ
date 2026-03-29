arr = [i for i in input().split("-")]

for i in range(len(arr)):

    if str(arr[i]).find("+") > 0:
        Sum = 0
        plus = [i for i in str(arr[i]).split("+")]
        for j in range(len(plus)):
            Sum += int(plus[j])
        arr[i] = Sum

ans = 0
for i in range(len(arr)):
    ans -= int(arr[i])


print(ans + int(arr[0])*2)
