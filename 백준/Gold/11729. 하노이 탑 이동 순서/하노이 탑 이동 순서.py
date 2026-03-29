def move_disk(n, pole_x, pole_y, pole_z):

    if n == 1:
        print(pole_x, pole_z)
        return

    move_disk(n - 1, pole_x, pole_z, pole_y)
    print(pole_x, pole_z)
    move_disk(n - 1, pole_y, pole_x, pole_z)


n = int(input())

print(int(pow(2, n)-1))

if n < 21:
    move_disk(n, '1', '2','3')