public class Solution {
    public int[] SortArrayByParity(int[] nums) {
        
        int i=0,j=0;
//         while(i<nums.Length && j<nums.Length)
//         {
//             while(nums[i]%2==0)
//             {
//                 i++;
//             }
//             while(nums[j]%2!=0)
//             {
//                 j++;
//             }
            
            
//             (nums[i],nums[j]) = (nums[j],nums[i]);
//         }
        
        for(i=0;i<nums.Length;i++)
        {
            if(nums[i]%2==0)
            {
                (nums[i],nums[j]) = (nums[j],nums[i]);
                j++;
                
            }
        }

        
        return nums;
        
    }
    
   
}