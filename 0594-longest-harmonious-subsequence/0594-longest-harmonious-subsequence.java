class Solution {
    public int findLHS(int[] nums) {
        int res=0;
        int l=0,r=1;
        Arrays.sort(nums);
        while(r<nums.length){
            if(nums[r]-nums[l]==1){
                res=Math.max(res,r-l+1);
            }
            if(nums[r]-nums[l]<=1) r++;
            else l++;
        }
        return res;
    }
}