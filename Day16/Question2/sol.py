class Solution:
    def minDominoRotations(self, tops: List[int], bottoms: List[int]) -> int:
        n = len(tops)
        ans = float("inf")
        if len(tops)!=len(bottoms):
            return -1
        def get_ans(num):
            ans = float("inf")
        
            ntop = 0
            nbottom = 0
            for t,b in zip(tops, bottoms):
                if t!=num and b!=num:
                    return -1
                elif t!=num:
                    ntop +=1
                elif b!=num:
                    nbottom +=1
            return min(ntop, nbottom)
            
        ts = get_ans(tops[0]) 
        if (ts == -1):
            return get_ans(bottoms[0])
        else:
            return ts
