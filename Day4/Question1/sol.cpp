class Solution {
public:
    vector<int> majorityElement(vector<int>& nums) {
        int freq1 = 0, freq2 = 0;
        int cand1 = 23, cand2 = 0;
        for(auto & num : nums){
            if(num == cand1)freq1++;
            else if(num == cand2)freq2++;
            else if(freq1 == 0){
                freq1 = 1;
                cand1 = num;
            }
            else if(freq2 == 0){
                freq2 = 1;
                cand2 = num;
            }else{
                freq1--;
                freq2--;
            }
        }
        freq1 = freq2 = 0;
        for(auto num : nums){
            if(num == cand2)freq2++;
            else if(num == cand1)freq1++;
        }
        vector<int> res;
        int sz = nums.size();
        if(sz / 3 < freq1)res.push_back(cand1);
        if(sz / 3 < freq2)res.push_back(cand2);
        
        return res;
    }
}
