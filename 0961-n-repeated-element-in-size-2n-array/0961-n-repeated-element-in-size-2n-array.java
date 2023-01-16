class Solution {
    public int repeatedNTimes(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsValue(nums[i])){
                return nums[i];
            }
            map.put(i,nums[i]);
        }
        
        return 0;
    }
}