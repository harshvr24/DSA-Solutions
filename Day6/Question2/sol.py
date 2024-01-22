class Solution:
    def dominantIndex(self, nums: List[int]) -> int:
        highest = -1
        second = -1
        index = 0
        for i in range(len(nums)):
            if nums[i] > highest:
                second = highest
                highest = nums[i]
                index = i
            elif nums[i] > second:
                second = nums[i]
        if highest >= second * 2:
            return index
        else:
            return -1
