class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();

        fun(0,ans,new ArrayList<Integer>(),nums);
        return ans;
        
    }
    public void fun(int ind,List<List<Integer>>res,List<Integer>ans,int arr[]){
        if(ind==arr.length){
            res.add(new ArrayList<>(ans));
            return ;
        }
        ans.add(arr[ind]);
        fun(ind+1,res,ans,arr);
        ans.remove(ans.size()-1);
        fun(ind+1,res,ans,arr);
        
    }
}