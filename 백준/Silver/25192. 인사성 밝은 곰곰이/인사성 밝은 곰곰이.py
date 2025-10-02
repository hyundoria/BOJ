n = int(input())

cnt = 0

dict = {}

for i in range(n):

    s = input()

    if s == "ENTER":
        dict = {}
        continue

    else:

        if dict.get(s,-1) == -1:
            cnt += 1
            dict[s] = 1

print(cnt)