class Solution:
    def pushDominoes(self, dominoes: str) -> str:
        arr = list(dominoes)
        n = len(arr)
        l = r = -1
        for i, c in enumerate(arr):
            if c is '.':
                continue
            if c is 'L':
                if l >= r:
                    while l < i:
                        l += 1
                        arr[l] = 'L'
                else:
                    l = i
                    lo, hi = r + 1, l - 1
                    while lo < hi:
                        arr[lo] = 'R'
                        arr[hi] = 'L'
                        lo += 1
                        hi -= 1
            else:
                if r > l:
                    while r < i:
                        arr[r] = 'R'
                        r += 1
                else:
                    r = i
        if r > l:
            while r < n:
                arr[r] = 'R'
                r += 1
        
        return ''.join(arr)
