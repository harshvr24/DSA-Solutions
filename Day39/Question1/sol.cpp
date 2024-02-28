class Solution {
public:
    int countPartitions(vector<int> nums, int maxSum) {
        int partitions = 1;
        long long subSum = 0;
        for(int i = 0; i< nums.size(); i++) {
            if(subSum + nums[i] <= maxSum) subSum += nums[i];
            else {
                partitions++;
                subSum = nums[i];
            }
        }
        return partitions;
    }

    int splitArray(vector<int>& nums, int k) {
        int low = *max_element(nums.begin(), nums.end());
        int high = accumulate(nums.begin(), nums.end(), 0);
        while(low <= high) {
            int mid = (low+high)/2;
            int partitions = countPartitions(nums, mid);
            if(partitions >k ) low = mid+1;
            else high = mid-1;
        }
        return low;
    }
};
