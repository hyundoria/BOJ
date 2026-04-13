import bisect

n = int(input())

arr1 = list(map(int, input().split()))

idx_in_arr1 = {num: idx for idx, num in enumerate(arr1)}

arr2 = list(map(int, input().split()))

arr2_sorted = [idx_in_arr1[num] for num in arr2]

def lcs(arr):

    lis = [arr[0]]

    for i in range(1,n):

        if arr[i] > lis[len(lis)-1]:
            lis.append(arr[i])
        else:
            k = bisect.bisect_left(lis, arr[i])
            lis[k] = arr[i]

    return len(lis)

print(lcs(arr2_sorted))
