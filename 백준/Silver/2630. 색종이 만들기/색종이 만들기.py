from collections import deque

n = int(input())

arr = []

for _ in range(n):
    arr.append(list(map(int, input().split())))

paper = [0,0]

def conquer(x,y,k):
    global paper

    color = arr[x][y]
    flag = False

    for i in range(x, x+k):
        for j in range(y, y+k):
            if arr[i][j] != color:
                flag = True
                break
        if flag:
            break

    if flag:
        k = k // 2
        conquer(x, y, k)
        conquer(x, y + k, k)
        conquer(x + k, y, k)
        conquer(x + k, y + k, k)
    else:
        paper[color] += 1

    return paper


conquer(0,0, n)

print(paper[0])
print(paper[1])