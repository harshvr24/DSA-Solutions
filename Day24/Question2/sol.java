class Solution {
	public int sumSubseqWidths(int[] nums) {
		Arrays.sort(nums);
		long c = 1;
		long result = 0;
		long mod = 1000000007L;
		for (int i = 0, j = nums.length - 1; i < nums.length; i++, j--) {
			result = (result + (nums[i] * c) - (nums[j] * c)) % mod;
			c = (c * 2) % mod;
		}
		return (int) ((result + mod) % mod);
	}
}
