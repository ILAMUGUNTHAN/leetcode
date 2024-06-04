class Solution {
    public void nextPermutation(int[] A) {
        int i = A.length-2;
        while(i>=0 && A[i]>=A[i+1]) i--;
        
        if(i>=0)
        {
            int j = A.length-1;
            while(A[j]<=A[i]) j--;
            swap(A,i,j);
        }
        reverse(A,i+1,A.length-1);
        
    }
    
    public void swap(int[] nums,int a, int b)
    {
        int tem = nums[a];
        nums[a] = nums[b];
        nums[b] = tem;
    }
    
    public void reverse(int []A,int i,int j)
    {
        while(i<j) swap(A,i++,j--);
    }
}