class Solution:
    def sumSubseqWidths(self, nums: List[int]) -> int:
        mod = 10**9 + 7
        nums.sort()
        ans, pow2 = 0, 1
        for x, y in zip(nums, reversed(nums)):
            ans += (x - y) * pow2
            pow2 = pow2 * 2 % mod
        return ans % mod
