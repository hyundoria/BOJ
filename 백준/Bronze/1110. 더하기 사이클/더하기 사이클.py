n = int(input())

t = n
count = 0
while (True):
  a = t // 10
  b = t % 10
  t = (b*10) + ((a+b)%10)
  count += 1
  if (t == n):
    break
print(count)