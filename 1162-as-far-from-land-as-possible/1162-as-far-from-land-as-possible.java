class Solution {
    public int maxDistance(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean vis[][]=new boolean[m][n];
        Queue<int[]>q=new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    vis[i][j]=true;
                    q.offer(new int[]{i,j});
                }
            }
        }
        int dir[][]=new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
        int res=-1;
        while(!q.isEmpty()){
            int size=q.size();
            while(size-->0){
                int cur[]=q.poll();
                res=Math.max(res,grid[cur[0]][cur[1]]-1);
                for(int dirs[]:dir){
                    int x=cur[0]+dirs[0], y=cur[1]+dirs[1];
                    if(x>=0 && x<m && y>=0 && y<n && !vis[x][y]){
                        vis[x][y]=true;
                        grid[x][y]=grid[cur[0]][cur[1]]+1;
                        q.offer(new int[]{x,y});
                    }
                }
            }
        }
        return res==0?-1:res;
    }
}