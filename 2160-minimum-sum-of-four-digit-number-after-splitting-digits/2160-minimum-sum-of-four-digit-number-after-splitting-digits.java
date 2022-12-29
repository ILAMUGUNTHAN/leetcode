class Solution {
    public int minimumSum(int num) {
        int arr[]=new int[5];
        int ind=0;
        while(num>0){
            arr[ind++]=num%10;
            num/=10;
        }
        Arrays.sort(arr);
        return ((arr[1]*10)+arr[4])+ ((arr[2]*10)+arr[3]);
    }
}