n = int(input())


for n in range(1, n+1):
  a, b = input().split()
  a = int(a)
  b = int(b)
  print(f'Case #{n}: {a} + {b} = {a+b}')  