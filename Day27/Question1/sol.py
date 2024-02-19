t = int(input())

for _ in range(t):
    n = int(input())
    a = list(map(int, input().split()))

    min_val = float('inf')
    max_val = float('-inf')
    min_index = -1
    max_index = -1

    for i in range(n):
        if a[i] < min_val:
            min_val = a[i]
            min_index = i + 1

        if a[i] > max_val:
            max_val = a[i]
            max_index = i + 1

        if max_val - min_val >= i + 1:
            print("YES")
            print(min_index, i + 1)
            break

    else:
        print("NO")
