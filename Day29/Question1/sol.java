class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int n = name.length();
        int m = typed.length();
        int i=0;
        int j=0;
        if(name.charAt(0) != typed.charAt(0))
            return false;
        if(n>m){
            return false;
        }
        while(i<n && j<m){
            if(name.charAt(i) == typed.charAt(j)){
                i++;
                j++;
            }
            else if(name.charAt(i-1) == typed.charAt(j)){
                j++;
            }
            else{
                return false;
            }
        }
        while(j<m){
            if(name.charAt(i-1) == typed.charAt(j)){
                j++;
            }
            else{
                return false;
            }
        }
        if(i<n){
            return false;
        }
        return true;       
    }
}
