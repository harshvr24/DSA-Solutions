def sortedSquares(nums):
    result = [num ** 2 for num in nums]
    result.sort()
    return result

nums = [-4, -1, 0, 3, 10]
result = sortedSquares(nums)

for num in result:
    print(num, end=" ")
