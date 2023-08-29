class Solution {
    public int bestClosingTime(String customers) {
       
        int ans = 0, max = 0, time = -1;
        for(int i=0;i<customers.length();i++)
        {
            ans+= (customers.charAt(i)=='Y')?1:-1;
            if(ans>max)
            {
                max = ans;
                time = i;
            }
        }
        return time+1;
    }
}