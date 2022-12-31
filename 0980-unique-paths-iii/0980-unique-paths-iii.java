class Solution {
    public int uniquePathsIII(int[][] grid) {
        int s1=0;
        int s2=0;
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    s1=i;
                    s2=j;
                }else if(grid[i][j]==0){
                    count++;
                }
            }
        }
        return path(grid,s1,s2,count+1);
    }
    int path(int[][] grid,int i,int j,int count){
        if(i>=grid.length||i<0||j>=grid[i].length||j<0||grid[i][j]==-1) return 0;
        if(grid[i][j]==2){
            if(count==0) return 1;
            return 0;
        }
        int temp=grid[i][j];
        grid[i][j]=-1;
        int res=path(grid,i+1,j,count-1)+path(grid,i-1,j,count-1)+path(grid,i,j+1,count-1)+path(grid,i,j-1,count-1);
        grid[i][j]=temp;
        return res;
    }
}