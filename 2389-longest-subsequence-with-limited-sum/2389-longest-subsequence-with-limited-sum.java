class Solution {
    public int[] answerQueries(int[] nums, int[] q) {
        int res[]= new int[q.length];
        Arrays.sort(nums);
        int sum=0;
        int ind=0;
        for(int i=0;i<q.length;i++){
            sum=0;
            for(int j=0;j<nums.length;j++){
                sum+=nums[j];
                if(sum>q[i]){
                    res[i]=j;
                    break;
                }
                if(j==nums.length-1 && sum<=q[i]){
                    res[i]=j+1;
                }
            }
        }
        return res;
        
    }
}