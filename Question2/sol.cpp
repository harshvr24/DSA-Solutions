class Solution {
public:
    int maxDistToClosest(vector<int>& seats) {
        int n=seats.size();
        vector<int> person;
        int ans=0;
        
        for(int i=0;i<seats.size();i++) if(seats[i]==1) person.push_back(i);
        for(int i=1;i<person.size();i++)
        {
            ans=max(ans,(person[i]-person[i-1])/2);
        }
        ans=max(ans,person[0]-0);
        ans=max(ans,n-1-person[person.size()-1]);
        return ans;
    }
};
