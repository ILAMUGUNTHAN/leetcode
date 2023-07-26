class Solution {
    public void setZeroes(int[][] matrix) {
    //instead of using seperate row/col array we're storing in 0th row and cloumn
        boolean isR0 = false, isC0 = false;
        for(int i=0;i<matrix[0].length;i++){
            if(matrix[0][i] == 0)
            {
                isR0 = true;
            }
        }
        for(int j=0;j<matrix.length;j++)
        {
            if(matrix[j][0] == 0)
            {
                isC0 = true;
            }
        }
        
        for(int i=1;i<matrix.length;i++)
        {
            for(int j=1;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
                
            }
        }
        for(int i=1;i<matrix.length;i++)
        {
            for(int j=1;j<matrix[0].length;j++)
            {
                if(matrix[0][j] == 0 || matrix[i][0] == 0)
                {
                    matrix[i][j] = 0;
                }
                
            }
        }
        
        if(isR0)
        {
            for(int i=0;i<matrix[0].length;i++)
            {
                matrix[0][i]=0;
            }
        }
        if(isC0)
        {
            for(int j=0;j<matrix.length;j++)
            {
                matrix[j][0]=0;
            }
        }
    }
}