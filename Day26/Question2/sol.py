class Solution:
    def numTimesAllBlue(self, flips):
        right, ans = 0, 0
        for i, flip in enumerate(flips):
            right = max(right, flip)
            if right == i + 1:
                ans += 1
        return ans
