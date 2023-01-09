class Solution {
    public int mostWordsFound(String[] sentences) {
        int len=0;
        for(String s:sentences){
            String str[]=s.split(" ");
            len=Math.max(len,str.length);
        }
        return len;
        
    }
}