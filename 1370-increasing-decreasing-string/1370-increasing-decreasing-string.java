class Solution {
    public String sortString(String s) {
        String res="";
        int hash[]=new int[26];
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i)-'a']++;
        }
        int k=0;
        while(k<s.length()){
            for(int i=0;i<26;i++){
                if(hash[i]>0){
                    res+=((char)(i+'a'))+"";
                    hash[i]--;
                    k++;
                }
            }
            for(int i=25;i>=0;i--){
                if(hash[i]>0){
                    res+=((char)(i+'a'))+"";
                    hash[i]--;
                    k++;
                }
            }
        }
        return res;
        
    }
}