class Solution {
public:
    double cur_large;
    double ans=99999;
    int ans_row,ans_col;
    int cur_row,cur_col;
    int smaller_count(double mid,vector<int>& arr)
    {
        int row=0, col=0;
        int counter=0;
        cur_large=0;
        for(int i=0;i<arr.size();i++)
        {
            while(col<arr.size() && mid<((double)arr[row])/((double)arr[col]))
            {
                col++;
            }
            if(col<arr.size() && cur_large<((double)arr[row])/((double)arr[col]))
            {
                cur_large=((double)arr[row])/((double)arr[col]);
                cur_row=row;
                cur_col=col;
            }
            counter+=arr.size()-col;
            row++;
        }
        return counter;
    }
    vector<int> kthSmallestPrimeFraction(vector<int>& arr, int k) {
        int n=arr.size();
        double start=0.0;
        double end=1.0;
        int counting;
        while(start<end)
        {
            double mid=(start+end)/2;
            counting=smaller_count(mid,arr);
            if(counting>=k)
            {
                if(ans>cur_large)
                {
                    ans=cur_large;
                    ans_row=cur_row;
                    ans_col=cur_col;
                }
                end=mid;
                if(counting==k)
                    break;
            }
            else
            {
                start=mid;
            }
        }
        vector<int> out;
        if(ans==99999)
        {
            return out;
        }
        else
        {
            out.push_back(arr[ans_row]);
            out.push_back(arr[ans_col]);
            return out;
        }
    }
};
