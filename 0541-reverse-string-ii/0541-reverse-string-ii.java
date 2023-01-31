class Solution {
    public String reverseStr(String s, int k) {
        char str[]=s.toCharArray();
        for(int i=0;i<s.length()-1;i+=2*k){
            int a=i;
            int b=Math.min(i+k -1,s.length()-1);
            
            while(a<b){
                char temp=str[a];
                str[a++]=str[b];
                str[b--]=temp;
            }
        }
        return new String(str);
    }
}