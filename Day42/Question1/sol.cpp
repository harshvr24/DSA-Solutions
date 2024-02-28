class Solution {
public:
    bool isValid(int mid, vector<int>& nums) {
        return nums[mid] <= nums[nums.size() - 1];
    }

    int findMin(vector<int>& nums) {
        int invalid = -1;
        int valid = nums.size() - 1;

        while (abs(valid - invalid) > 1) {
            int mid = (valid + invalid) / 2;

            if (isValid(mid, nums)) {
                valid = mid;
            } else {
                invalid = mid;
            }
        }

        return nums[valid];
    }
};
