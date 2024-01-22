class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        num_zeros = 0
        total_product = 1

        for num in nums:
            if num == 0:
                num_zeros += 1
                if num_zeros == 2:
                    return [0 for _ in nums]
            else:
                total_product *= num

        if num_zeros == 1:
            return [total_product if num == 0 else 0 for num in nums]
        else:
            return [total_product]
