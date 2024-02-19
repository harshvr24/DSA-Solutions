class Solution {
public:
    int maxSumTwoNoOverlap(vector<int>& nums, int firstLen, int secondLen) {
        int n = nums.size();
        vector<int> left1(n), right1(n), left2(n), right2(n);
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < n; ++i) {
            if (i >= firstLen) sum1 -= nums[i-firstLen];
            if (i >= secondLen) sum2 -= nums[i-secondLen];
            sum1 += nums[i];
            sum2 += nums[i];
            if (i >= firstLen - 1) left1[i] = i ? max(left1[i-1], sum1) : sum1;
            if (i >= secondLen - 1) left2[i] = i ? max(left2[i-1], sum2) : sum2;
        }
        sum1 = 0, sum2 = 0;
        int res = INT_MIN;
        for (int i = n - 1; i >= 0; --i) {
            if (i + firstLen < n) sum1 -= nums[i+firstLen];
            if (i + secondLen < n) sum2 -= nums[i+secondLen];
            sum1 += nums[i];
            sum2 += nums[i];
            if (i <= n - firstLen) right1[i] = i + 1 < n ? max(right1[i+1], sum1) : sum1;
            if (i <= n - secondLen) right2[i] = i + 1 < n ? max(right2[i+1], sum2) : sum2;
            if (i) {
                res = max(res, right1[i] + left2[i-1]);
                res = max(res, right2[i] + left1[i-1]);
            }
        }
        return res;
    }
};
