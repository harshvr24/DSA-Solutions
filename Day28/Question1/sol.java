class Solution {
    public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
        for (int i = 1; i < nums.length; ++i){
            nums[i] += nums[i - 1];
        }
        int res = nums[firstLen + secondLen - 1];
        int maxFirst = nums[firstLen - 1];
        int maxSecond = nums[secondLen - 1];
        for (int i = firstLen + secondLen; i < nums.length; i++){
            maxFirst = Math.max(maxFirst, nums[i - secondLen] - nums[i - firstLen - secondLen]);
            maxSecond = Math.max(maxSecond, nums[i - firstLen] - nums[i - secondLen - firstLen]);
            res = Math.max(res, Math.max(maxFirst + nums[i] - nums[i - secondLen], maxSecond + nums[i] - nums[i - firstLen]));
        }
        return res;
    }
}
