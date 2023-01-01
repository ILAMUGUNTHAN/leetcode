class Solution {
    public int[] decompressRLElist(int[] nums) {
        int n=0;    
        for(int i=0;i<nums.length;i+=2){
            n+=nums[i];
        }
        int ind=0;
        int res[]=new int[n];
        for(int i=0;i<nums.length;i+=2){
            Arrays.fill(res,ind,ind+nums[i],nums[i+1]);
            ind+=nums[i];
        }
        
        return res;
    }
}