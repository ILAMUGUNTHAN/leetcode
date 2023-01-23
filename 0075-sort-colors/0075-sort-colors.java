class Solution {
    public void sortColors(int[] nums) {
        int l=0,m=0,h=nums.length-1;
        while(m<=h){
            switch(nums[m]){
                case 0:
                    swap(nums,l,m);
                    l++;
                    m++;
                    break;
                case 1:
                    m++;
                    break;
                case 2:
                    swap(nums,m,h);
                    h--;
                    break;
            }
        }
    }
    public void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}