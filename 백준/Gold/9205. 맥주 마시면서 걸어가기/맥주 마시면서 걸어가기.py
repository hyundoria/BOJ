from collections import deque

t = int(input())

# 반경 1000안에 편의점 유무 확인 and 목적지 유무 확인
# 없으면 끝

def bfs(home, cu, festival):

    q = deque()
    homex, homey = home
    q.append((homex, homey))

    festx, festy = festival

    while q:

        new_cu = []

        # 현재 위치
        x, y = q.popleft()

        fes_lenth = abs(abs((festx-x)) + abs((festy-y)))

        if fes_lenth <= 1000:
            return "happy"

        for i in range(len(cu)):

            dx, dy = cu[i]

            lenth = abs(abs((dx-x)) + abs((dy-y)))

            if lenth > 1000:
                new_cu.append(cu[i])
                continue
            else:
                q.append((dx, dy))

        cu = new_cu

    return "sad"




for _ in range(t):
    n = int(input())

    home = map(int, input().split())

    cu = []

    for _ in range(n):
        x,y = map(int, input().split())
        cu.append((x, y))

    festival = map(int, input().split())

    print(bfs(home, cu, festival))
