def gcd(a, b):
    while b:
        a, b = b, a % b
    return a

def are_relatively_prime(nums):
    n = len(nums)
    for i in range(n - 1):
        for j in range(i + 1, n):
            if gcd(nums[i], nums[j]) != 1:
                return False
    return True

# Example
nums = [3, 8, 10, 17]
result = are_relatively_prime(nums)
print(result)
