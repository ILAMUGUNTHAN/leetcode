class Solution {
    public int maxProfit(int[] arr) {
        int ans=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            min=Math.min(min,arr[i]);
            ans=Math.max(ans,arr[i]-min);
        }
        return ans;
    }
}