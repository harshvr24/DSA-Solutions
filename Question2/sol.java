class Solution {
    public int maxDistToClosest(int[] seats) {
        int max=-1;
        int curr=0;
        for(int i=0;i<seats.length;i++)
        {
            if(seats[i]==0)
            {
                curr++;
            }
            else
            {
                if(max<curr)
                {
                    if(max==-1)
                        max=2*curr;
                    else
                    {
                        max=curr;
                    }
                }
                curr=0;
            }
        }
        if(max>curr*2)
            return (max+1)/2;
        else
            return curr;
    }
}
