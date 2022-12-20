class Solution {
    public int search(int[] nums, int target) {
        int i=0,j=nums.length-1;
        int mid;
        while(i<=j){
            mid=(i+j)/2;
            if(target==nums[mid]) return mid;
            else if(target<nums[mid]) j=mid-1;
            else i=mid+1;
        }
        return -1;
    }
}