class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int freq1 = 0, freq2 = 0;
        int cand1 = 23, cand2 = 0;
        for(var num : nums){
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
        for(var num : nums){
            if(num == cand2)freq2++;
            else if(num == cand1)freq1++;
        }
        List<Integer> res = new ArrayList<>();
        int sz = nums.length;
        if(sz / 3 < freq1)res.add(cand1);
        if(sz / 3 < freq2)res.add(cand2);
        
        return res;
    }
}
