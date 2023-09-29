public class Solution {
    public bool IsMonotonic(int[] nums) {
        if(nums.Length==1) return true;
        int f1 = 0,f2=0;
        for(int i=1;i<nums.Length;i++)
        {
            if(nums[i-1]<=nums[i]) f1++;
            if(nums[i-1]>=nums[i]) f2++;
        }
        //Console.WriteLine(f1+" "+f2);
        return (f1==nums.Length-1) || (f2==nums.Length-1);
        
        
    }
}