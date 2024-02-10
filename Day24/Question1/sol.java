class Solution {
    public boolean validPalindrome(String s) {
        if(s == null || s.length() < 1) {
            return false;
        }
        int p1 = 0;
        int p2 = s.length() - 1;
        while(p1 < p2) {
            if(s.charAt(p1) != s.charAt(p2)) {
                return palindromeCheck(s, p1, p2 - 1) || palindromeCheck(s, p1 + 1, p2);
            }
            p1++;
            p2--;
        }
        return true;
    }
    public boolean palindromeCheck(String s, int leftIndex, int rightIndex) {
        int p1 = leftIndex;
        int p2 = rightIndex;
        while(p1 < p2) {
            if(s.charAt(p1) != s.charAt(p2)) {
                return false;
            }
            p1++;
            p2--;
        }
        return true;
    }
}
