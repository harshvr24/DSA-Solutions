class Solution:
    def shipWithinDays(self, weights: List[int], days: int) -> int:
        def is_enough(max_load):
            total = 1
            curr_load = 0
            for w in weights:
                if curr_load + w <= max_load:
                    curr_load += w
                else:
                    total += 1
                    curr_load = w
            return total <= days

        max_load = max(weights)
        daily = (len(weights)-1) // days + 1
        h = max_load * daily
        l = max(max_load, min(weights)*daily)
        print(l, h)
        while l <= h:
            m = (l + h) // 2
            if is_enough(m):
                h = m - 1
            else:
                l = m + 1
        return l
