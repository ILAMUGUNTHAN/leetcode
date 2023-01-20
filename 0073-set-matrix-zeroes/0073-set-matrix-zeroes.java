class Solution {
    public void setZeroes(int[][] mat) {
        int hash[][]=new int[mat.length][mat[0].length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0){
                    hash[i][j]++;
                }
            }
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(hash[i][j]>0){
                    for(int k=0;k<mat.length;k++){
                        for(int l=0;l<mat[0].length;l++){
                            if(k==i||l==j){
                                mat[k][l]=0;
                            }
                        }
                        
                    }
                }
            }
        }
        
    }
}