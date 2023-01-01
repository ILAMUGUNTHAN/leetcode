public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int b) {
        int count=0;
        String n=Integer.toBinaryString(b);
        for(int i=0;i<n.length();i++){
            if(n.charAt(i) =='1'){
                count++;
            }
        }
        return count;
        
    }
}