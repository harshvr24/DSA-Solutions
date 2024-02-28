class Solution:
    def findMin(self, nums: List[int]) -> int:
        def is_valid(mid: int) -> bool:
            return nums[mid] <= nums[-1]

        invalid = -1
        valid = len(nums) - 1

        while abs(valid - invalid) > 1:
            mid = (valid + invalid) // 2

            if is_valid(mid):
                valid = mid
            else:
                invalid = mid

        return nums[valid]
