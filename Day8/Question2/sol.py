T = int(input())

for _ in range(T):
    N, K = map(int, input().split())
    A = list(map(int, input().split()))

    max_sum = current_sum = A[0]

    for i in range(1, N * K):
        current_sum = max(A[i % N], current_sum + A[i % N])
        max_sum = max(max_sum, current_sum)

    print(max_sum)
