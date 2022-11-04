class Solution {
    public boolean isPalindrome(int x) {
        
        char[] str=Integer.toString(x).toCharArray();
        int n=str.length;
        for(int i=0;i<n;i++){
            if(str[i]!=str[n-1]){
                return false;
            }
            n--;
        }
        return true;
        
    }
}