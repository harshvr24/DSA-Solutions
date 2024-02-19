class Solution:
    def maxSumTwoNoOverlap(self, nums: List[int], firstLen: int, secondLen: int) -> int:
        def orderedSum(fl, sl):
            fcur, scur = sum(nums[:fl]), sum(nums[fl:fl+sl])
            fmax = fcur
            res = fmax+scur
            for i in range(fl+sl, len(nums)): # 3
                fcur += nums[i-sl]-nums[i-fl-sl] # 0+6-0
                scur += nums[i]-nums[i-sl] # 11+2-6
                fmax = max(fmax, fcur)
                res = max(res, fmax+scur)
            return res
        
        return max(orderedSum(firstLen, secondLen), orderedSum(secondLen, firstLen))
