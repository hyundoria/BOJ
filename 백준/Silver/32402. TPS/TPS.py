n = int(input())

x,y = 0,0

# 카메라(S,A,W,D) , d가 0일때 기준
# 카메라(D,S,A,W) , d가 1일떄 기준
# 카메라(W,D,S,A) , d가 2일떄 기준
dir = [[0,-1],[-1,0],[0,1],[1,0]]

d = 0

for _ in range(n):

    s = input()

    if s == "MR":
        d = (d + 1)%4
    elif s == "ML":
        d = (d - 1)%4
    else:

        k = 0
        if s == "D":
            k = 3
        elif s == "W":
            k = 2
        elif s == "A":
            k = 1

        k = (k + d)  % 4

        x,y = x + dir[k][0], y + dir[k][1]

    print(x, y, x+dir[d][0], y+dir[d][1])
