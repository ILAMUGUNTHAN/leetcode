class Solution {
    public int maxProfit(int[] prices) {
        int res=0;
        int max=0;
        for(int i=1;i<prices.length;i++){
            int c=res;
            res=Math.max(res+prices[i]-prices[i-1],max);
            max=Math.max(c,max);
        }
        return Math.max(res,max);
        
    }
}