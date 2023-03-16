class Solution {
    public String replaceDigits(String s) {
        String res="";
        for(int i=0;i<s.length();i++){
            System.out.println(res);
            if(Character.isDigit(s.charAt(i))){
                res+=(char)((char)s.charAt(i-1)+(char)((s.charAt(i)-'0')));
                // s=s.replaceFirst(""+s.charAt(i),""+s.charAt(i-1)+(s.charAt(i)-'0'));
            }else{
                res+=s.charAt(i)+"";
            }
        }
        return res;

    }
    
}