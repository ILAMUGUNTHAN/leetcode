public class Solution {
    int i = 1;
    int ctr =2;
    int val = 0;
    int count = 0;
    public int TotalMoney(int n) {
        
        return rec(n);
    }
    
    public int rec(int n)
    {
        if(n==0)
        {
            return val;
        }
        
        if(count == 7)
        {
            //Console.WriteLine(val+" ");
            i = ctr;
            ctr++;
            count=0;
        }
        
        val += i;
        i++;
        count++;
        n--;
        rec(n);
        
        return val;
    }
}