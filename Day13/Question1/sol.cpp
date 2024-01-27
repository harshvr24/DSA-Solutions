class Solution {
public:
    int consecutiveNumbersSum(int n) {
        int ans=1;
        for(int i=2;i<n;i++) {
            if((i*(i+1))/2 > n) return ans;
            if((n - (i*(i+1))/2)%i==0) ans++;
        }
        return ans;
    }
};
