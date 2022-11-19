class Solution {
    public int or(int[]p,int[]q,int[]r){
        return (r[1]-q[1])*(q[0]-p[0])-((q[1]-p[1])*(r[0]-q[0]));
    }
    public int[][] outerTrees(int[][] tree) {
        Stack<int[]>u=new Stack<>();
        Stack<int[]>l=new Stack<>();
        Arrays.sort(tree,(p,q)->q[0]-p[0]==0?q[1]-p[1]:q[0]-p[0]);
        for(int i=0;i<tree.length;i++){
            while(l.size()>=2 && or(l.get(l.size()-2),l.get(l.size()-1),tree[i])>0){
                l.pop();
            }
            while(u.size()>=2 && or(u.get(u.size()-2),u.get(u.size()-1),tree[i])<0){
                u.pop();
            }
            l.push(tree[i]);
            u.push(tree[i]);
        }
        Set<int[]>set=new HashSet<>(l);
        set.addAll(u);
        return set.toArray(new int[set.size()][]);
    }
}