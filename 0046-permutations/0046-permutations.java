class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> sub=new ArrayList<>();
        boolean f[]=new boolean[nums.length];
        rec(nums,sub,list,f);
        return list;
    }
    private void rec(int[] nums,List<Integer>ds,List<List<Integer>> ans,boolean[] f){
        if(ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
            return ;
        }
        for(int i=0;i<nums.length;i++){
            if(!f[i]){
                f[i]=true;
                ds.add(nums[i]);
                rec(nums,ds,ans,f);
                ds.remove(ds.size()-1);
                f[i]=false;
            }
        }
    }
}