class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n = arr.length;
        int count=0;
        int curr=0;
        for(int i=0;i<n;i++){
            curr += arr[i];
            if(curr ==((i)*(i+1))/2){
                count++;
            }
        }
        return count;
    }
}
