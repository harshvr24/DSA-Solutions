class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int l = nums.size();
        int arr1 [l];
        int arr2 [l];
        arr1[l-1]=1;
        arr2[0]=1;
        for(int i=l-2;i>=0;i--)
        {
            arr1[i]=nums[i+1]*arr1[i+1];
        }
        for(int i=1;i<l;i++)
        {
            arr2[i]=nums[i-1]*arr2[i-1];
        }
        vector<int> res;

        for(int i=0;i<l;i++)
        {
            res.push_back(arr1[i]*arr2[i]);
        }
        return res; 
    }
}
