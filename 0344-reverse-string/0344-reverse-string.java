class Solution {
    public void reverseString(char[] s) {
        int len=s.length -1;
        char temp;
        for(int i=0;i<len;i++){
            temp=s[i];
            s[i]=s[len];
            s[len--]=temp;
        }
    }
}