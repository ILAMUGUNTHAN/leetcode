class Solution {
    public int smallestEvenMultiple(int n) {
        int val=n;
        while(n>0){
            if(n%2==0 && n%val==0){
                return n;
            }
            n++;
        }
        return 0;
    }
}