class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right)
    {
        int lb = -1, rb = -1;
        int max = Integer.MIN_VALUE;
        int total = 0;
        int count = 0;
        while(rb < nums.length - 1)
        {
            rb++;
            int num = nums[rb];

            if(num >= left && num <= right)
                count = rb - lb;                       
            else if(num > right)
            {
                count = 0;
                lb = rb;
            }
            total += count;
        }
        return total;
    }
}
