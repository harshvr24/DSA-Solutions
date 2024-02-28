def findMin(nums):
    low, high = 0, len(nums) - 1

    while low < high:
        mid = low + (high - low) // 2

        if nums[mid] > nums[high]:
            low = mid + 1
        elif nums[mid] < nums[high]:
            high = mid
        else:
            high -= 1

    return nums[low]
