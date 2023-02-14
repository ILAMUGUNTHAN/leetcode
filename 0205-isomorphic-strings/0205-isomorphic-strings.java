class Solution {
    public boolean isIsomorphic(String s, String t) {
        int hash1[]=new int[300],hash2[]=new int[300];
        for(int i=0;i<s.length();i++){
            if(hash1[s.charAt(i)]!=hash2[t.charAt(i)]) return false;
            hash1[s.charAt(i)]=i+1;
            hash2[t.charAt(i)]=i+1;
        }
        return true;
       
    }
}