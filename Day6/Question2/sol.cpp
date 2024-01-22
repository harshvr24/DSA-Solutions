class Solution {
public:
    int dominantIndex(vector<int>& nums) {
        int highest = -1;
        int second = -1;
        int index = 0;
        for (int i = 0; i < nums.size(); i++)
        {
            if (nums[i] > highest)
            {
                second = highest;
                highest = nums[i];
                index = i;
            }
            else if (nums[i] > second)
            {
                second = nums[i];
            }
        }
        if (highest >= second * 2)
        {
            return index;
        }
        else
        {
            return -1;
        }
    }
}
