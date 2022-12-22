class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int i=m+n-1,l=m-1,h=n-1;
        while((l>=0 && h>=0)&& i>=0){
            if(nums1[l]>nums2[h]) nums1[i--]=nums1[l--];
            else{
                nums1[i--]=nums2[h--];
            }
        }
        if(l<0) for(int q=0;q<=i;q++) nums1[q]=nums2[q];
        
    }
    
}