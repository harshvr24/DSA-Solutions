class Solution:
    def maxDistToClosest(self, seats: List[int]) -> int:
        l, r = None, None
        ans = 0
        max_dist = 0
        for i, seat in enumerate(seats):
            if seat == 1:
                l = r
                r = i

                if l is None:
                    dist = r
                else:
                   dist = (r-l) // 2 
                
                if dist > max_dist:
                    max_dist = dist
        l = r
        r = None
        dist = len(seats) -1 - l
        if dist > max_dist:
            max_dist = dist
        return max_dist
