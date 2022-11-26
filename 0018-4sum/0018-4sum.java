class Solution {
    public List<List<Integer>> fourSum(int[] nums, int tar) {
        ArrayList<List<Integer>> res=new ArrayList<List<Integer>>();
        if(nums==null || nums.length==0) return res;
        int n=nums.length;
        Arrays.sort(nums);
        long target=tar;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                long tar2=target-nums[j]-nums[i];
                int f=j+1;
                int b=n-1;
                while(f<b){
                    int sum=nums[f]+nums[b];
                    if(sum<tar2) f++;
                    else if(sum>tar2) b--;
                    else{
                        List<Integer> q=new ArrayList();
                        q.add(nums[i]);
                        q.add(nums[j]);
                        q.add(nums[f]);
                        q.add(nums[b]);
                        res.add(q);
                        
                        while(f<b && nums[f]==q.get(2)) ++f;
                        while(f<b && nums[b]==q.get(3)) --b;
                    }
                }
                while(j+1<n && nums[j+1]==nums[j])++j;
                
            }
            while(i+1<n && nums[i+1]==nums[i]) ++i;
        }
        return res;
        
    }
}