class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int s=0;
        int l=0;
        List<Integer> list=new ArrayList<Integer>();
        
        while(s<nums1.length && l<nums2.length){
            if(nums1[s]<nums2[l]){
                s++;
            }else if(nums1[s]>nums2[l]){
                l++;
            }else{
                list.add(nums1[s]);
                s++;
                l++;
            }
        }
        int arr[]=new int[list.size()];
        int ind=0;
        for(int i:list){
            arr[ind++]=i;
        }
        return arr;
    }
}