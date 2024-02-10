class Solution:
    def validPalindrome(self, s: str) -> bool:
        half = len(s)//2+1
        s_rev = s[-half:][::-1]
        if s[:half] == s_rev:
            return True
        for i in range(0, half):
            if s[i] != s_rev[i]:
                return s[i+1:half] == s_rev[i:half-1] or s[i:half-1] == s_rev[i+1:]
        return True
