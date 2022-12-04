class Solution {
    public int minimumAverageDifference(int[] nums) {
        long sum=0;
        long len=nums.length;
        for(int i:nums) sum+=i;
        long min=Integer.MAX_VALUE;
        long ls=0,rs=0,ans=0;
        for(int i=0;i<len;i++){
            ls+=nums[i];
            rs=sum-ls;
            long d=Math.abs(ls/(i+1)-(len-i==1?0:rs/(len-i-1)));
            if(d<min){
                min=d;
                ans=i;
            }
        }
        return (int)ans;
    }
}