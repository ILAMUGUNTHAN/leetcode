class Solution {
    private List<List<Integer>>build(int n,int[][]edges){
        List<List<Integer>>graph=new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        return graph;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>>gr=build(n,edges);
        boolean[] visited =new boolean[n];
        Queue<Integer>queue=new LinkedList<>();
        queue.offer(source);
        while(!queue.isEmpty()){
            int cur=queue.poll();
            if(cur==destination) return true;
            visited[cur]=true;
            for(int neigh:gr.get(cur)){
                if(!visited[neigh]) queue.offer(neigh);
            }
        }
        return false;
                
        
    }
}