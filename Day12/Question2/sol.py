t = int(input())

for _ in range(t):
    n, k = map(int, input().split())

    # Set a1 and a2 to 1, and distribute the remaining sum to a3, a4, ..., ak.
    print(1, 1, end=" ")
    for i in range(3, k + 1):
        print(n - k + i - 1, end=" ")
    print()
