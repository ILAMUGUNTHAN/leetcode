class Solution {
    public int jump(int[] nums) {
        int ans=0,a=0,b=0;
        for(int i=0;i<nums.length-1;i++){
            b=Math.max(b,i+nums[i]);
            if(i==a){
                ans++;
                a=b;
            }
        }
        return ans;
    }
}