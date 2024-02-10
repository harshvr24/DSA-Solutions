def find_winner(n, m, A, B):
    xor_sum = 0
    
    for size in A:
        xor_sum ^= size
    
    for size in B:
        xor_sum ^= size
    
    return "Bob" if xor_sum == 0 else "Alice"

def main():
    T = int(input())

    for _ in range(T):
        n, m = map(int, input().split())
        A = list(map(int, input().split()))
        B = list(map(int, input().split()))

        result = find_winner(n, m, A, B)
        print(result)

if __name__ == "__main__":
    main()
