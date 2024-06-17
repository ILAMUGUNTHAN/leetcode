class Solution {
    public boolean judgeSquareSum(int c) {
        long n = (long)Math.sqrt(c);
        long l = 0;
        while(l<=n)
        {
            if(l*l + n*n == c)
            {
                return true;
            }
            else if(l*l + n*n <c)
            {
                l++;
            }
            else if(l*l + n*n >c){
                n--;
            }
        }
        
        return false;
    }
}