class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int f[]=new int[128];
        for(char c:s1.toCharArray()) f[c]++;
        int s=0,e=0,ctr=s1.length();
        while(e<s2.length()){
            if(f[s2.charAt(e)]>0) ctr--;
            f[s2.charAt(e)]--;
            while(ctr==0){
                if((e-s+1)==s1.length()) return true;
                f[s2.charAt(s)]++;
                if(f[s2.charAt(s)]>0) ctr++;
                s++;
            }
            e++;
        }
        return false;
    }
}