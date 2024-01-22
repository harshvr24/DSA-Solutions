class Solution {
    int maxi(int[] a,int n)
    {
        int max=(int)-9999999;
        int f=-1;
        for(int i=0;i<n;i++)
        {
            if(max<=a[i])
            {
                max=a[i];
                f=i;
            }
        }
        a[f]=(int)-9999999;
        return max;
    }
    int min(int[] a,int n)
    {
        int max=(int)999999;
        int f=-1;
        for(int i=0;i<n;i++)
        {
            if(a[i]!=-9999999)
            {
                if(max>=a[i])
            {
                max=a[i];
                f=i;
            }
            }
        }
        a[f]=(int)999999;
        return max;
    }
    public int maximumProduct(int[] a) {
        int n=a.length;
        int aa=maxi(a,n);
        int b=maxi(a,n);
        int c=maxi(a,n);
        if(n==3)
        {
            return aa*b*c;
        }
        int x=min(a,n);
        int y=min(a,n);
        if(n==4)
        {
            y=c;
        }
        return Math.max(aa*b*c,aa*x*y);
    }
}
