class Solution {
    public String convert(String s, int n) {
        char ch[]=s.toCharArray();
        StringBuffer sb[]=new StringBuffer[n];
        for(int i=0;i<sb.length;i++){
            sb[i]=new StringBuffer();
        }
        int i=0;
        while(i<ch.length){
            for(int ind=0;ind<n&& i<ch.length;ind++){
                sb[ind].append(ch[i++]);
            }
            for(int ind=n-2;ind>=1 && i<ch.length;ind--){
                sb[ind].append(ch[i++]);
            }
        }
        for(int ind=1;ind<sb.length;ind++){
            sb[0].append(sb[ind]);
        }
        return sb[0].toString();
    }
}