def is_prime(num):
    if num < 2:
        return False
    for i in range(2, int(num**0.5) + 1):
        if num % i == 0:
            return False
    return True

def generate_primes(m, n):
    primes = [num for num in range(m, n+1) if is_prime(num)]
    return primes

def main():
    t = int(input("Enter the number of test cases: "))
    for _ in range(t):
        m, n = map(int, input().split())
        primes = generate_primes(m, n)
        
        for prime in primes:
            print(prime)
        print()  # Empty line between test cases

if __name__ == "__main__":
    main()
