class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer>set=new HashSet<>();
        for(int i:nums) set.add(i);
        int count=0;
        for(int i:nums){
            if(!set.contains(i-1)){
                int cur=1;
                int val=i;
                while(set.contains(val+1)){
                    cur++;
                    val++;
                }
                count=Math.max(cur,count);
            }
        }
        return count;
        
    }
}