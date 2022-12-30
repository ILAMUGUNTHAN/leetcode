class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<Integer>c=new ArrayList<>();
        c.add(0);
        List<List<Integer>>ans=new ArrayList<>();
        dfs(0,c,graph,ans);
        return ans;
    }
    private void dfs(int s,List<Integer>cur,int[][] graph,List<List<Integer>>ans){
        if(s==graph.length-1){
            ans.add(new ArrayList(cur));
            return ;
        }
        for(int a:graph[s]){
            cur.add(a);
            dfs(a,cur,graph,ans);
            cur.remove(cur.size()-1);
        }
    }
}