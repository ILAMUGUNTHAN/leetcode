class Solution {
    public int repeatedNTimes(int[] nums) {
        int hash[]=new int[10001];
        for(int i=0;i<nums.length;i++){
            hash[nums[i]]++;
        }
        for(int i=0;i<nums.length;i++){
            if(hash[nums[i]]>1) return nums[i];
        }
        return 0;
    }
}