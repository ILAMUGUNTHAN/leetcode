class Solution {
    public boolean closeStrings(String w1, String w2) {
        int hash1[]=new int[26];
        int hash2[]=new int[26];
        for(int i=0;i<w1.length();i++){
            hash1[w1.charAt(i)-'a']++;
        }
        for(int j=0;j<w2.length();j++){
            hash2[w2.charAt(j)-'a']++;
        }
        for(int i=0;i<26;i++){
            if((hash1[i]!=0 && hash2[i]==0)||( hash1[i]==0&&hash2[i]!=0)) return false;
        }
        Arrays.sort(hash1);
        Arrays.sort(hash2);
        for(int i=0;i<26;i++){
            if(hash1[i]!=hash2[i]) return false;
        }
        return true;
    }
}