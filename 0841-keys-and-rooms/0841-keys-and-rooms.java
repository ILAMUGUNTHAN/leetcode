class Solution {
    static boolean[] visited;
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        visited=new boolean[rooms.size()];
        visited[0]=true;
        search(rooms,0);
        for(boolean b:visited){
            if(!b) return false;
        }
        
        return true;
    }
    public void search(List<List<Integer>> rooms,int ind){
        for(int i:rooms.get(ind)){
            if(!visited[i]){
                visited[i]=true;
                search(rooms,i);
            }
        }
    }
}