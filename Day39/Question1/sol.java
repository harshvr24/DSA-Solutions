class Solution {
    public int countPartitions(int[] nums, int maxSum) {
        int partitions = 1;
        long subSum = 0;
        for (int num : nums) {
            if (subSum + num <= maxSum) {
                subSum += num;
            } else {
                partitions++;
                subSum = num;
            }
        }
        return partitions;
    }

    public int splitArray(int[] nums, int k) {
        int low = Arrays.stream(nums).max().getAsInt();
        int high = Arrays.stream(nums).sum();
        while (low <= high) {
            int mid = (low + high) / 2;
            int partitions = countPartitions(nums, mid);
            if (partitions > k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
}
