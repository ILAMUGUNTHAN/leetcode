class Solution {
    public int findDuplicate(int[] nums) {
        int f = nums[0];
        int s = nums[0];
        do{
            f = nums[nums[f]];
            s = nums[s];
        }while(f!=s);
        
        f = nums[0];
        while(f!=s)
        {
            f = nums[f];
            s = nums[s];
        }
        return s;
    }
}