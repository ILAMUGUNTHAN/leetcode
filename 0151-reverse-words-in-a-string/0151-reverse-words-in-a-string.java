class Solution {
    public String reverseWords(String s) {
        String str[] = s.split(" ");
        String res = "";
        for(int i = str.length-1;i>=0;i--)
        {
            res+=str[i].trim();
            if(i>0 && str[i].trim().length()>0)
            {
                res+=" ";
            }
            
        }
        
        
        return res.trim();
    }
}