class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if((mat.length==r && mat[0].length==c) || (r*c !=mat.length * mat[0].length)){
            return mat;
        }
        int ind=0,ind2=0;
        int res[][]=new int[r][c];
        int arr[]=new int[r*c];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                arr[ind++]=mat[i][j];
            }
        }
        int k=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                res[i][j]=arr[k++];
            }
        }
        return res;
    }
}