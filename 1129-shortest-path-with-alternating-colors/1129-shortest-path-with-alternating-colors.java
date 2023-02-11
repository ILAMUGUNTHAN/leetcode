class Solution {
    public int[] shortestAlternatingPaths(int n, int[][] red, int[][] blue) {
        Set<Integer>[][] graph=new HashSet[2][n];
        for(int i=0;i<n;i++){
            graph[0][i]=new HashSet<>();
            graph[1][i]=new HashSet<>();
        }
        for(int[] r:red){
            graph[0][r[0]].add(r[1]);
        }
        for(int[] b:blue){
            graph[1][b[0]].add(b[1]);
        }
        int[][] res=new int[2][n];
        for(int i=1;i<n;i++){
            res[0][i]=2*n;
            res[1][i]=2*n;
        }
        Queue<int[]>q=new LinkedList<>();
        q.offer(new int[]{0,0});
        q.offer(new int[]{0,1});
        while(!q.isEmpty()){
            int[]cur=q.poll();
            int ver=cur[0];
            int col=cur[1];
            
            for(int next:graph[1-col][ver]){
                if(res[1-col][next]==2*n){
                    res[1-col][next]=1+res[col][ver];
                    q.offer(new int[]{next,1-col});
                }
            }
        }
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            int t=Math.min(res[0][i],res[1][i]);
            ans[i]=(t==2*n)?-1:t;
        }
        return ans;
    }
}