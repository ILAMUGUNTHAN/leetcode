class Solution {
    public int numSquares(int n) {
        
        int dp[]=new int[n+1];
        Arrays.fill(dp,n);
        dp[0]=0;
        for(int i=0;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i-(j*j)<0){
                    break;
                }else{
                    dp[i]=Math.min(dp[i],1+dp[i-(j*j)]);
                }
            }
        }
        return dp[n];
    }
}