class Solution {
public:
    vector<int> partitionLabels(string s) {   
        int n = s.length();
        int hash[26];
        for(int i = 0; i< n; i++)
        {
            hash[s[i]-'a'] = i;
        }     
        int max = -1;
        vector<int> diff;
        for(int i = 0; i < n; i++)
        {
            if(hash[s[i]-'a'] > max)
            {
                 max = hash[s[i]-'a'];
            }
            if(max == i)
            {
                diff.push_back(i);
            }
        }
        vector<int> ans;
        ans.push_back(diff[0] + 1);
        for(int i = 1; i< diff.size(); i++)
        {
            ans.push_back(diff[i]-diff[i-1]);
        }
        return ans;
    }
};
