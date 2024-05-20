public class Solution {
    public int SubsetXORSum(int[] nums) {
        
        return rec(nums,0,0);
    }
    
    public int rec(int[] nums, int ind , int ans)
    {
        if(ind == nums.Length)
        {
            return ans;
        }
        
        return rec(nums,ind+1,ans^nums[ind])+rec(nums,ind+1,ans);
    }
}