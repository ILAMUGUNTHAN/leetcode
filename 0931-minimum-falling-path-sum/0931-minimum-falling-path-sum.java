class Solution {
    public int minFallingPathSum(int[][] mat) {
        int res[][]=new int[mat.length][mat[0].length];
        int min=Integer.MAX_VALUE;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                int a=Integer.MAX_VALUE;
                int b=Integer.MAX_VALUE;
                int c=Integer.MAX_VALUE;
                if(i-1>=0){
                    a=res[i-1][j];
                }
                if(i-1>=0&&j-1>=0){
                    b=res[i-1][j-1];
                }
                if(i-1>=0&& j+1<mat[0].length){
                    c=res[i-1][j+1];
                }
                if(a==Integer.MAX_VALUE && b==Integer.MAX_VALUE && c==Integer.MAX_VALUE){
                    res[i][j]=mat[i][j];
                }else{
                    res[i][j]=Math.min(a,Math.min(b,c))+mat[i][j];
                }
                if(i==mat.length-1){
                    min=Math.min(min,res[i][j]);
                }

            }
        }
        
        
        return min;

    }
}