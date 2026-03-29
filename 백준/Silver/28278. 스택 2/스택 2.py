import sys
input = sys.stdin.readline

stack = []
res = []

t = int(input())

for _ in range(t):
    cmd = input().strip().split()

    if cmd[0] == '1':
        stack.append(cmd[1])
    elif cmd[0] == '2':
        if stack:
            res.append(stack.pop())
        else:
            res.append('-1')
    elif cmd[0] == '3':
        res.append(str(len(stack)))
    elif cmd[0] == '4':
        res.append('1' if not stack else '0')
    elif cmd[0] == '5':
        res.append('-1' if not stack else stack[-1])

print('\n'.join(res))
