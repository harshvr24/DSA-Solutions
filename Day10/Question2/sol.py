class Solution:
    def partitionLabels(self, s: str) -> List[int]:
        c_index = defaultdict(list)
        for i in range(len(s)):
            if s[i] in c_index:
                c_index[s[i]][1] = i
            else:
                c_index[s[i]] = [i, i]

        intervals = list(c_index.values())
        intervals = sorted(intervals, key=lambda x: x[0])
        bigstart, bigend = 0, 0
        res = []
        for start, end in intervals:
            if start == 0:
                bigstart, bigend = start, end
                continue
            if start > bigend:
                res.append(bigend - bigstart + 1)
                bigstart = start
            bigend = max(bigend, end)
        res.append(bigend - bigstart + 1)
        return res
