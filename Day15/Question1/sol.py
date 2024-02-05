def wiggle_sort(nums):
    nums.sort()

    for i in range(1, len(nums) - 1, 2):
        nums[i], nums[i + 1] = nums[i + 1], nums[i]

# Example usage:
nums = [3, 5, 2, 1, 6, 4]
wiggle_sort(nums)
print(nums)
