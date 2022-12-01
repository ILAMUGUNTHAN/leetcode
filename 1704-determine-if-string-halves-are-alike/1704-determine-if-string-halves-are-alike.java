class Solution {
    public boolean halvesAreAlike(String s) {
        String vow="AEIOUaeiou";
        String s1=s.substring(0,s.length()/2);
        String s2=s.substring(s.length()/2);
        int c1=0,c2=0;
        for(int i=0;i<s1.length();i++){
            if(vow.contains(s1.charAt(i)+"")) c1++;
        }
        for(int i=0;i<s2.length();i++){
            if(vow.contains(s2.charAt(i)+"")) c2++;
        }
        
        return c1==c2;
    }
}