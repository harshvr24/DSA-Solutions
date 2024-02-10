class Solution {
public:
    int numTimesAllBlue(vector<int>& flips) {
        int right = 0, ans = 0;
        for (int i = 0; i < flips.size(); ++i) {
            right = max(right, flips[i]);
            if (right == i + 1) ans++;
        }
        return ans;
    }
};
