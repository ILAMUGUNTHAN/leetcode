class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        ArrayList<Integer>al[]=new ArrayList[n+1];
        for(int i=1;i<=n;i++){
            al[i]=new ArrayList<>();
        }
        for(int[] d:dislikes){
            al[d[0]].add(d[1]);
            al[d[1]].add(d[0]);
        }
        if(check(al,n)==true) return true;
        return false;
    }
    public boolean check(ArrayList<Integer>[] al,int n){
        int[] color=new int[n+1];
        for(int i=0;i<=n;i++){
            color[i]=-1;
        }
        for(int i=1;i<=n;i++){
            if(color[i]==-1){
                if(!bfs(al,i,color)) return false;
            }
        }
        return true;
    }
    public boolean bfs(ArrayList<Integer>[]al,int node,int[]color){
        Queue<Integer>q=new LinkedList<>();
        q.add(node);
        color[node]=1;
        while(!q.isEmpty()){
            Integer nde=q.poll();
            for(Integer it:al[nde]){
                if(color[it]==-1){
                    color[it]=1-color[nde];
                    q.add(it);
                }else if(color[it]==color[nde]) return false;
            }
        }
        return true;
    }
}