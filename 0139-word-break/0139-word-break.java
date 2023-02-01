class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean res[]=new boolean[s.length()];
        for(int i=0;i<s.length();i++){
            for(int j=0;j<=i;j++){
                if(wordDict.contains(s.substring(j,i+1)) && (j==0 || res[j-1])){
                    res[i]=true;
                    break;
                }
            }
        }
        
        return res[s.length()-1];
        
    }
}