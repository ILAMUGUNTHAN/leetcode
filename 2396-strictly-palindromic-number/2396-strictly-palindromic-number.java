class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for(int i=0;i<n-1;i++){
            StringBuilder sb=new StringBuilder(Integer.toBinaryString(i));
            
            if(! (sb.toString()).equals((sb.reverse().toString()))) return false;
        }
        return true;
    }
}