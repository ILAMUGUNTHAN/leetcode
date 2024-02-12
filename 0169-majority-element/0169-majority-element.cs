public class Solution {
    public int MajorityElement(int[] nums) {
        
        int c=0;
        int lar=0;
        foreach(int i in nums){
            if(c==0){
                lar=i;
            }
            if(i==lar){
                c++;
            }else{
                c--;
            }
        }
        return lar;
    }
}