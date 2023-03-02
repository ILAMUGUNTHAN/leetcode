class Solution {
    public String firstPalindrome(String[] words) {
        
        for(String s:words){
            StringBuilder sb=new StringBuilder(s);
            if(sb.reverse().toString().equals(s)) return s;
        }
        return "";
        
    }
}