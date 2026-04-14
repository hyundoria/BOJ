n = int(input())

arr = []

center_x,center_y,center_e = map(int, input().split())

for _ in range(n):

    x,y,e = map(int, input().split())
    arr.append((x,y,e))

rhddyd = []

for x,y,e in arr:

    t = max(0, center_e -  (abs(x-center_x) + abs(y-center_y)))
    rhddyd.append(t)

for i in range(n):

    x,y,e = arr[i]

    for a_x,a_y,a_e in arr:

        t = max(0, a_e -  (abs(x-a_x) + abs(y-a_y)))

        rhddyd[i] -= t
    

m = max(rhddyd)

if m <= 0:
    print("IMPOSSIBLE")
else:
    print(m)
