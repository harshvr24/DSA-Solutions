class Solution:
    def majorityElement(self, nums: List[int]) -> List[int]:
        freq1, freq2 = 0, 0
        cand1, cand2 = 0, 0
        
        for num in nums:
            if num == cand1:
                freq1 += 1
            elif num == cand2:
                freq2 += 1
            elif freq1 == 0:
                freq1 = 1
                cand1 = num
            elif freq2 == 0:
                freq2 = 1
                cand2 = num
            else:
                freq1 -= 1
                freq2 -= 1
        freq1, freq2 = 0, 0
        for num in nums:
            if num == cand2:
                freq2 += 1
            elif num == cand1:
                freq1 += 1
        
        res = []
        sz = len(nums)
        if sz // 3 < freq1:
            res.append(cand1)
        if sz // 3 < freq2:
            res.append(cand2)
        
        return res
