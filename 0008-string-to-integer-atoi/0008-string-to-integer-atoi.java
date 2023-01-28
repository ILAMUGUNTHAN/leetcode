class Solution {
    public int myAtoi(String s) {
        int val=1,i=0,r=0;
        s=s.trim();
        if(s.isEmpty()) return 0;
        else if(s.charAt(i)=='-'){
            i++;
            val=-1;
        }
        else if(s.charAt(i)=='+'){
            i++;
        }
        while(i<s.length() && Character.isDigit(s.charAt(i))){
            int num=s.charAt(i)-'0';
            if(r>(Integer.MAX_VALUE-num)/10) {
                return val>0?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            r = r*10 + num;
            i++;
        }
        return r*val;
        
    }
}