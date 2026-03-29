n = int(input())

arr = list(map(int, input().split()))

arr.sort()

left, right = 0, n-1

plus_ans = 2000000000
minus_ans = -2000000000
plus_ans_val = [0, 0]
minus_ans_val = [0, 0]

while left < right:

    solution = arr[left] + arr[right]

    if solution > 0:
        if plus_ans > solution:
            plus_ans = solution
            plus_ans_val = arr[left],arr[right]
        right -= 1
    else:
        if minus_ans < solution:
            minus_ans = solution
            minus_ans_val = arr[left],arr[right]
        left += 1

if plus_ans > -minus_ans:
    print(minus_ans_val[0], minus_ans_val[1])
else:
    print(plus_ans_val[0], plus_ans_val[1])