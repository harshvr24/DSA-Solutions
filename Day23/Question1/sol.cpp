class Solution {
public:
    string pushDominoes(string s) {
        string ans=s;
        int n=ans.size(),r=-1;
        for(int i=0; i<n; i++) {
            if(s[i]=='L' && r==-1) {
                for(int l=i-1; l>=0 && s[l]=='.'; l--) {
                    ans[l]='L';
                }
            }
            else if(s[i]=='R') {
                while(r!=-1 && r<i)
                    ans[r++]='R';
                r=i;
            }
            else if(s[i]=='L') {
                int l=i;
                while(r<l) {
                    ans[r++]='R';
                    ans[l--]='L';
                }
                r=-1;
            }
        }
        while(r!=-1 && r<n)
            ans[r++]='R';
        return ans;
    }
};
