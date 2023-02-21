class Solution {
    public int minOperations(int[] nums) {
        int count=0;
        while(!isIncreasing(nums)){
            for(int i=1;i<nums.length;i++){
                if(nums[i]<=nums[i-1]){
                    nums[i]++;
                    count++;
                }
            }
        }
        return count;
    }
    public boolean isIncreasing(int nums[]){
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>=nums[i]) return false;
        }
        return true;
    }
}