class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int res[]=new int[nums.length];
        int ind=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                res[ind++]=nums[i];
                
            }
        }
        for(int i=0;i<nums.length;i++) if(nums[i]%2==1) res[ind++]=nums[i];
        
        return res;
    }
}