class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)) return "";
        int value=len(str1.length(),str2.length());
        if(str1.length()<str2.length()){
            return str1.substring(0,value);
        }
        return str2.substring(0,value);
    }
    public int len(int a,int b){
        if(b==0) return a;
        return a%b==0?b:len(b,a%b); 
    }
}