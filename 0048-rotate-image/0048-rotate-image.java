class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=i;j<matrix[0].length;j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
            Reverse(i, matrix);
        }
    }
    
    public void Reverse(int row,int[][] matrix)
    {
        int n = matrix[0].length-1;
        for(int i=0;i<matrix[0].length/2;i++)
        {
            int temp = matrix[row][i];
            matrix[row][i] = matrix[row][n];
            matrix[row][n--] = temp;
        }
    }
}