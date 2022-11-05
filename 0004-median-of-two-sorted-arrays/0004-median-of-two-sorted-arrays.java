class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr[]=new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, arr, 0, nums1.length);
        System.arraycopy(nums2, 0, arr, nums1.length, nums2.length);
        Arrays.sort(arr);
        int len=arr.length;
        if(len %2!=0) return arr[len /2];

        double mid1=arr[len/2 -1];
        double mid2=arr[len/2 ];
        
        return (mid1+mid2)/2;
    }
}