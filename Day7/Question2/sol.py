class Solution:
    def numSubarrayBoundedMax(self, A: List[int], left: int, right: int) -> int:
        dp = 0
        res = 0
        prev = -1
        for i,n in enumerate(A):
            if n > right:
                dp = 0
                prev = i
            elif left <= n <= right:
                dp = i - prev
                res += dp
            else:
                res += dp
        return res

