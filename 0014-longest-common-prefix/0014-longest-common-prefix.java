class Solution {
    public String longestCommonPrefix(String[] str) {
        for(int i=0;i<str[0].length();i++){
            for(int j=1;j<str.length;j++){
                if(i>=str[j].length()||str[j].charAt(i)!=str[0].charAt(i)){
                    return str[0].substring(0,i);
                }
            }
        }
        return str[0];
    }
}