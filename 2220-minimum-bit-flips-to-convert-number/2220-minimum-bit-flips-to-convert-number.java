class Solution {
    public int minBitFlips(int start, int goal) {
        String a = Integer.toBinaryString(start);
        String b = Integer.toBinaryString(goal);
        
        int count=0;
        
        if(a.length()>b.length())
        {
            b = "0".repeat(a.length()-b.length())+b;
        }
        else 
        {
            a = "0".repeat(b.length()-a.length())+a;
        }
        
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i) != b.charAt(i)) count++;
        }
        
        
        return count;
    }
}