n = int(input())

arr = []

dic = {}

for i in range(n):

    arr.append(input())

    m = len(arr[i])

    for j in range(m):

        k = arr[i][j:j+1]

        if k in dic:
            dic[k] = dic[k] + (10 ** (m-j))
        else:
            dic[k] = 10 ** (m-j)

dic = sorted(dic.items(), key = lambda item: item[1], reverse = True)

sort = dict()

i = 9

for a, b in dic:
    sort.setdefault(a)
    sort[a] = i
    i -= 1

plus = []

for i in range(len(arr)):
    num = str()
    for j in range(len(arr[i])):
        k = arr[i][j:j+1]

        num += str(sort[k])
    plus.append(num)

cnt = 0

for i in plus:
    cnt += int(i)
print(cnt)
