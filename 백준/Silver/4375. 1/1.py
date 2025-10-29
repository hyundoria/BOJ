
while True:

    try:
        n = int(input())

        i = 1

        while True:

            if i % n == 0:
                print(len(str(i)))
                break
            else:
                i *= 10
                i += 1



    except EOFError:
        break