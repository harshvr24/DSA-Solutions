class Solution {
public:
    int numSubarrayBoundedMax(vector<int>& nums, int left, int right) {
        ios::sync_with_stdio(false);
        cin.tie(0);
        cout.tie(0);
        
        int i = 0, t1 = -1, t0 = -1, res = 0;
        for(int &x : nums) {
            if(x > right) t1 = i;
            if(x >= left) t0 = i;
            
            res += t0 - t1;
            ++i;
        }
        return res;
    }
}
