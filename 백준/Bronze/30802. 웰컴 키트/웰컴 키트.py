n = int(input())

arr = list(map(int, input().split()))

t,p = map(int, input().split())

cntt = 0

for size in arr:

     cnt = size // t
     skajwl = size % t

     cntt += cnt

     if skajwl != 0:
          cntt += 1

print(cntt)

print((n // p),  (n % p))