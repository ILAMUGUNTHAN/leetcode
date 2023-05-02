class Solution {
    public int arraySign(int[] nums) {
        int val=0;
        for(int i:nums){
            if(i==0) return 0;
            if(i<0) val++;
            
        } 
        if(val%2==1) return -1;
        return 1;
    }
}