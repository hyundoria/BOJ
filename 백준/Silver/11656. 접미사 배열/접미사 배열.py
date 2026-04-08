str = input()

sub = ""

result = []

for i in str[::-1]:

    sub += i
    result.append(sub[::-1])

result.sort()

for i in result:
    print(i)