class Solution {
public:
    bool validPalindrome(string s) {
        ios_base::sync_with_stdio(false);
        cin.tie(NULL);
        cout.tie(NULL);
        for(int i =0,j=s.size()-1;i<=j;i++,j--){
            if(s[i]!=s[j]){
                int i1_s = i+1;
                int j1_e = j;
                int i2_s = i;
                int j2_e = j-1;
                while(i1_s<j1_e && s[i1_s]==s[j1_e]){
                        i1_s++;
                        j1_e--;
                    }
                    if(i1_s>=j1_e){
                        return true;
                    }
                    else{
                        while(i2_s<j2_e && s[i2_s]==s[j2_e]){
                        i2_s++;
                        j2_e--;
                    }
                    return i2_s>=j2_e?true:false;
                    }
                }
            }
            return true;
        }
};
