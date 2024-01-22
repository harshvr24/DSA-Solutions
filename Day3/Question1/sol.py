class Solution:
    def nextGreaterElement(self, n: int) -> int:
        s = list(str(n))
        flag = False
        for i in range(len(s)-1, 0, -1):
            if s[i-1] < s[i]:
                j = -1
                while s[i-1] >= s[j]:
                    j -= 1
                s[i-1], s[j] = s[j], s[i-1]
                s[i:] = sorted(s[i:])
                flag = True
                break
        m = int(''.join(s))
        if m >= 2**31 or m < 1 or not flag: 
            return -1
        else: 
            return m
