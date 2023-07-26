class Solution {
    public void setZeroes(int[][] mat) {
        int row[] = new int[mat.length];
        int col[] = new int[mat[0].length];
        
        for(int i=0;i<row.length;i++)
        {
            for(int j=0;j<col.length;j++)
            {
                if(mat[i][j] == 0)
                {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        
        for(int i=0;i<row.length;i++)
        {
            for(int j=0;j<col.length;j++)
            {
                if(row[i] == 1)
                {
                    mat[i][j] = 0;
                }
                else if(col[j] == 1)
                {
                    mat[i][j] = 0;
                }
            }
        }
        
    }
}