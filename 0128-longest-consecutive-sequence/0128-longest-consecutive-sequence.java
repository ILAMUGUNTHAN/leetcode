class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0 || nums==null) return 0;
        Set<Integer>set=new HashSet<>();
        for(int i:nums) set.add(i);
        int count=0;
        for(int i:nums){
            if(!set.contains(i-1)){
                int currnum=i;
                int currcount=1;
                while(set.contains(currnum+1)){
                    currnum++;
                    currcount++;
                }
                count=Math.max(count,currcount);
            }
        }
        return count;
    }
}