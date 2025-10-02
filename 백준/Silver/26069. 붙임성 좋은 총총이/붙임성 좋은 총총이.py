n = int(input())

cnt = 0

dict = {"ChongChong" : 1}

for i in range(n):

    s1, s2 = input().split()

    if dict.get(s1,-1) != -1:
        dict[s2] = 1
    elif dict.get(s2,-1) != -1:
        dict[s1] = 1



print(len(dict))