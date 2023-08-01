class Solution {
    public void rotate(int[][] matrix) 
    {
        int col = 0;
        int row = matrix.length-1;
        int mat[][] = new int[matrix.length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                mat[i][j] = matrix[i][j];
            }
        }
        
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix.length;j++)
            {
                //System.out.println(row+","+col+" "+mat[row][col]);
                matrix[i][j] = mat[row--][col];
                
            }
            row = matrix.length-1;
            col++;
        }
        
    }

    
}