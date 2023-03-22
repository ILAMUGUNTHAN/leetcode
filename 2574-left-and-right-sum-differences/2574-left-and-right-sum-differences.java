class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int leftsum=0;
        int res[]=new int[nums.length];
        int tot=0;
        for(int i:nums) tot+=i;
        int right=tot;
        int ls[]=new int[nums.length];
        int rs[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            //System.out.print(leftsum+" ");
            ls[i]=leftsum;
            leftsum+=nums[i];
            right=Math.abs(tot-leftsum);
            rs[i]=right;
            // System.out.println(" "+right);
            
            
        }
        for(int i=0;i<nums.length;i++){
            res[i]=Math.abs(ls[i]-rs[i]);
        }
        return res;
        
    }
}