class Solution {
    public int sumOfUnique(int[] nums) {
        int count=0;
        int hash[]=new int[101];
        for(int i=0;i<nums.length;i++){
            hash[nums[i]]++;
        }
        for(int i=0;i<nums.length;i++){
            if(hash[nums[i]]==1) count+=nums[i];
        }
        return count;
    }
}