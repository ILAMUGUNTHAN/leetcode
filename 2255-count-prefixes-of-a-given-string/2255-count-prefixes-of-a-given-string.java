class Solution {
    public int countPrefixes(String[] words, String s) {
        int res=0;
        for(String str:words){
            if(s.startsWith(str)) res++;
            
        }
        return res;
    }
}