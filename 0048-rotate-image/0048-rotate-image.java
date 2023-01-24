class Solution {
    public void rotate(int[][] mat) {
        int dum1[][]=new int[mat.length][mat[0].length];
        //System.out.print(Arrays.toString(mat[2]));
        int ind=0;
        int len=mat.length-1;

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                dum1[j][len-i]=mat[i][j];
            }
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                mat[i][j]=dum1[i][j];
            }
        }

    }
}