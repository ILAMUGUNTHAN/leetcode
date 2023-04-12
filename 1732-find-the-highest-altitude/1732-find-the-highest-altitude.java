class Solution {
    public int largestAltitude(int[] gain) {
        int arr[]=new int[gain.length+1];
        int res=0;
        arr[0]=0;
        for(int i=1;i<=gain.length;i++){
            arr[i]=arr[i-1]+gain[i-1];
        }
        Arrays.sort(arr);
        return arr[arr.length-1];
        
    }
}