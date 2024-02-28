class Solution:
    def maxEl(self, nums):
        maxi = float('-inf')
        for num in nums:
            maxi = max(maxi, num)
        return maxi
    
    def sumByD(self, nums, div):
        _sum = 0
        for num in nums:
            _sum += -(-num // div)  # Equivalent to ceil(num / div)
        return _sum
    
    def smallestDivisor(self, nums: List[int], threshold: int) -> int:
        low = 1
        high = self.maxEl(nums)
        while low <= high:
            mid = low + (high - low) // 2
            if self.sumByD(nums, mid) <= threshold:
                high = mid - 1
            else:
                low = mid + 1
        return low
