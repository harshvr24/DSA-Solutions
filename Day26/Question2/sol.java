class Solution {
    public int numTimesAllBlue(int[] flips) {
        int right = 0, ans = 0;
        for (int i = 0; i < flips.length; i++) {
            right = Math.max(right, flips[i]);
            if (right == i + 1) {
                ans++;
            }
        }
        return ans;
    }
}
