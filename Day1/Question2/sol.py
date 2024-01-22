def rotate(nums, k):
    n = len(nums)
    k = k % n  # To handle cases where k is greater than the array size

    nums.reverse()
    nums[:k] = reversed(nums[:k])
    nums[k:] = reversed(nums[k:])

nums = [1, 2, 3, 4, 5, 6, 7]
k = 3

rotate(nums, k)
print(nums)
