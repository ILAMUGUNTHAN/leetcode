class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer>res = new ArrayList<>();
        int e1= -1000000;
        int e2 =-1000000;
        int c1 = 0,c2 = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(c1==0 && e2!=nums[i])
            {
                c1 = 1;
                e1 = nums[i];
            }
            else if(c2==0 && e1!=nums[i])
            {
                c2 = 1;
                e2=nums[i];
            }
            else if(nums[i]==e1)
            {
                c1++;
            }
            else if(nums[i]==e2)
            {
                c2++;
            }
            else{
                c1--;
                c2--;
            }
        }
        
        c1=c2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==e1) c1++;
            if(nums[i]==e2) c2++;
        }
        if(c1>nums.length/3)res.add(e1);
        if(c2>nums.length/3)res.add(e2);
        return res;
    }
}