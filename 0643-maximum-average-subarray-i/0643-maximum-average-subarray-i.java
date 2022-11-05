class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max=0;
        double win=0;
        for(int i=0;i<k;i++){
            win+=nums[i];
        }
        max=win;
        for(int i=k;i<nums.length;i++){
            win+=nums[i]-nums[i-k];
            max=Math.max(max,win);
        }
        return max/k;
    }
}