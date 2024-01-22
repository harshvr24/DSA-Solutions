class Solution {
public:
    int maximumProduct(vector<int>& nums) {
        int max1 = INT32_MIN, max2 = INT32_MIN, max3 = INT32_MIN;
        int min1 = INT32_MAX, min2 = INT32_MAX;
        for(int& num : nums) {
            if(num > max1) {
                max3 = max2, max2 = max1, max1 = num;
            }
            else if(num > max2) {
                max3 = max2, max2 = num;
            }
            else if(num > max3) {
                max3 = num;
            }
            if(num < min1) {
                min2 = min1, min1 = num;
            }
            else if(num < min2) {
                min2 = num;
            }
        }
        return std::max(max1*max2*max3, max1*min1*min2);
    }
}
