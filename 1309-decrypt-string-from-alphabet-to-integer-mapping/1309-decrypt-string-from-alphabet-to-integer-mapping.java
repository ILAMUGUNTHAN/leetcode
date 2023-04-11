class Solution {
    public String freqAlphabets(String s) {
        StringBuilder res=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)=='#')
            {
                int num = Integer.parseInt(s.charAt(i-2)+""+s.charAt(i-1));
                i-=2;
                res.append((char)('a'+num-1)+"");
                
            }
            else
            {
                res.append((char)('a'+Integer.parseInt(s.charAt(i)+"")-1)+"");
            }
        }
        return new String(res.reverse());
        
    }
}