const long M=1e9+7;
class Solution {
public:
    int sumSubseqWidths(vector<int>& nums) {
        ios::sync_with_stdio(false);
        cin.tie(nullptr);
        long sum=0, cnt=1;
        int n=nums.size();
        sort(nums.begin(), nums.end());
        for(int i=0, j=n-1; i<n; sum=(sum+(nums[i++]-nums[j--])*cnt)%M, cnt=cnt*2%M) {}
        return sum;
    }
};
