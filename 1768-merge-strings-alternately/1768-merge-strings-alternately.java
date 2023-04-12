class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        String res="";
        for(int i=0,j=0;i<word1.length()||j<word2.length();i++,j++)
        {
            if(i<word1.length()) res+=word1.charAt(i);
            if(j<word2.length()) res+=word2.charAt(j);
        }
        
        return res;
    }
}