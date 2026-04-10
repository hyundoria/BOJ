n = int(input())

result = {}
result[0] = "{}"
result[1] = "{{}}"

for i in range(2,16):

    ans = "{"
    for j in range(i):
        ans += result[j]
        if j != i-1:
            ans += ","
        else:
            ans += "}"
    result[i] = ans

re_result = {v:k for k,v in result.items()}

for _ in range(n):

    s1 = input()
    s2 = input()
    
    value = re_result.get(s1) + re_result.get(s2)

    print(result.get(value))




    
