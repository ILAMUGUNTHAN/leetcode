class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len=nums.length;
        int op[]=new int[2];
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<len;i++){
            if(map.containsKey(target-nums[i])){
                op[1]=i;
                op[0]=map.get(target-nums[i]);
                return op;
            }
            map.put(nums[i],i);
        }
        
    
        return op;
    }

}