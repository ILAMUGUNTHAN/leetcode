class Solution {
    public int subsetXORSum(int[] nums) {
       
        return func(nums,0,0);
    }
    int func(int arr[],int ind,int ans){
       
        if(ind==arr.length){
            return ans;
        }
        return func(arr,ind+1,ans^arr[ind])+func(arr,ind+1,ans);
    }
}