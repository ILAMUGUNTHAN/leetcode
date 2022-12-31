class Solution {
    public int rob(int[] nums) {
        int max=0;
        int max2=0;
        for(int i=0;i<nums.length;i++){
            int max3=max2+nums[i];
            max2=Math.max(max2,max);
            max=max3;
        }
        return Math.max(max,max2);
    }
}