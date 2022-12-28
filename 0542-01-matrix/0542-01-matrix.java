class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int res[][]= new int[mat.length][mat[0].length];
        int max=mat.length -1 + mat[0].length-1;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]!=0){
                    int up=(i>0)?res[i-1][j]:max;
                    int left=(j>0)?res[i][j-1]:max;
                    res[i][j]=Math.min(up,left)+1;
                }
            }
        }
        for(int i=mat.length-1;i>=0;i--){
            for(int j=mat[0].length-1;j>=0;j--){
                if(mat[i][j]!=0){
                    int down=(i<mat.length-1)?res[i+1][j]:max;
                    int right=(j<mat[0].length-1)?res[i][j+1]:max;
                    res[i][j]=Math.min(Math.min(down,right)+1,res[i][j]);
                }
            }
        }
        return res;
        
    }
}