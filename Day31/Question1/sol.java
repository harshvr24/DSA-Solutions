class Solution {
    public String orderlyQueue(String s, int k) {
        int[] countChar = new int[26];
        int length = s.length();
        for(int i = 0 ; i < length ; ++i) {
            countChar[s.charAt(i) - 'a']++;
        }
        if(k > 1) {
            StringBuilder sb = new StringBuilder();
            for(int i = 0 ; i < 26 ; ++i) {
                int appearance = countChar[i];
                char c = (char)('a' + i);
                for(int r = 0 ; r < appearance ; ++r) {
                    sb.append(c);
                }
            }
            return sb.toString();
        }
        char startChar = 'a';
        for(int i = 0 ; i < 26 ; ++i) {
            if(countChar[i] > 0) {
                startChar = (char)('a' + i);
                break;
            }
        }
        List<String> beginWithStartChar = new ArrayList<>();
        for(int i = 0 ; i < length ; ++i) {
            if(s.charAt(i) == startChar) {
                beginWithStartChar.add(s.substring(i) + s.substring(0, i));
            }
        }
        String min = beginWithStartChar.get(0);
        for(String strBeginWithStartChar : beginWithStartChar) {
            if(strBeginWithStartChar.compareTo(min) < 0) min = strBeginWithStartChar;
        }
        return min;
    }
}
