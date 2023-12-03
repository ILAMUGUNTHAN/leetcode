public class Solution {
    public int ArrangeCoins(int n) {
        
        long count = 0;
        for(int i=1;i<=n;i++)
        {
            count += i;
            if(count==n) return i;
            if(count>n)
            {
                return i-1;
            }
        }
        
        return 0;
        
    }
}