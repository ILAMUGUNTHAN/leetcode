class Solution {
    public int maxDepth(String s) {
        int max=0,res=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                max++;
            }
            if(s.charAt(i)==')'){
                max--;
            }
            res=Math.max(max,res);
        }
        return res;
    }
}