class Solution {
    public boolean divideArray(int[] nums) {
        int hash[]=new int[501];
        for(int i=0;i<nums.length;i++){
            hash[nums[i]]++;
        }
        for(int i=0;i<nums.length;i++){
            if(hash[nums[i]]%2!=0){
                return false;
            }
        }
        return true;
    }
}