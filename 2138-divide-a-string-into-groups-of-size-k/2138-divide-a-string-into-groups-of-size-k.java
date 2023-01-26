class Solution {
    public String[] divideString(String s, int k, char fill) {
        int m=s.length()%k;
        int n=s.length();
        int len=s.length() + ((m==0)?0:k-m);
        //System.out.println(s);
        for(int i=0;i<len-n;i++){
            s+=fill+"";
        }
        int ind=0;
        String str[]=new String[len/k];
        //System.out.println(s);
        for(int i=0;i<s.length();i+=k){
            str[ind++]=s.substring(i,i+k);
        }
        return str;
    }
}