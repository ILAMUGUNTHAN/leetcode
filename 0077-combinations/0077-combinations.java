class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>>ans=new LinkedList<>();
        com(1,n,k,new LinkedList<>(),ans);
        return ans;
    }
    void com(int ind,int n,int k,List<Integer> list,List<List<Integer>>res){
        if(k==0){
            res.add(new LinkedList<>(list));
            return ;
        }
        list.add(ind);
        if(ind<=n) com(ind+1,n,k-1,list,res);
        list.remove(list.size()-1);
        if(ind<=n) com(ind+1,n,k,list,res);
    }
}