class Solution {
    public int maximumWealth(int[][] acc) {
        int sum=0;
        for(int i=0;i<acc.length;i++){
            int sub=0;
            for(int j=0;j<acc[i].length;j++){
                sub+=acc[i][j];
            }
            sum=Math.max(sum,sub);
        }
        return sum;
    }
}