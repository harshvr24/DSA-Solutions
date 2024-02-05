class Solution:
    def maximumSwap(self, num):
        num = list(str(num))
        max_idx = len(num) - 1
        small = large = 0
        
        for i in range(len(num) - 1, -1, -1): 
            if num[i] > num[max_idx]:
                max_idx = i  # this is the right side max number index
            elif num[i] < num[max_idx]:
                small = i
                large = max_idx
                
        num[small], num[large] = num[large], num[small]
        return int(''.join(num)) # join a list of string/charaters
