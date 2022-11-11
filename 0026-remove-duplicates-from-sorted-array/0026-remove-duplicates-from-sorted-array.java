class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer>st=new HashSet<Integer>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(st.add(nums[i])){
                nums[count++]=nums[i];   
            }
        }
        
        
       
        return count;
        
    }
}