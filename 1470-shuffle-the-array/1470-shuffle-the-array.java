class Solution {
    public int[] shuffle(int[] nums, int n) {
        int res[]=new int[nums.length];
        for(int i=0,j=n,ind=0;ind<nums.length;i++,j++){
            res[ind++]=nums[i];
            res[ind++]=nums[j];
        }
        return res;
    }
    
}