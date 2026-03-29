a, p = map(int, input().split())

d = {a: 1}

while True:

    a = str(a)

    n = 0

    for c in a:

        n += int(c)**p

    a = n

    if d.get(n) is None:
        d.update({n: 1})
    else:
        d.update({n: d.get(n) + 1})
        if d.get(n) == 3:
            break

cnt = 0

for i in d.values():

    if i == 1:
        cnt += 1

print(cnt)


