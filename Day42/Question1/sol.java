class Solution {
    private boolean isValid(int mid, int[] nums) {
        return nums[mid] <= nums[nums.length - 1];
    }

    public int findMin(int[] nums) {
        int invalid = -1;
        int valid = nums.length - 1;

        while (Math.abs(valid - invalid) > 1) {
            int mid = (valid + invalid) / 2;

            if (isValid(mid, nums)) {
                valid = mid;
            } else {
                invalid = mid;
            }
        }

        return nums[valid];
    }
}
