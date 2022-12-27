class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int add) {
        int count=0;
        int need[]=new int[rocks.length];
        for(int i=0;i<capacity.length;i++){
            need[i]=capacity[i]-rocks[i];
        }
        Arrays.sort(need);
        for(int i=0;i<need.length;i++){
            if(add<need[i]) break;
            else {
                count++;
                add=add-need[i];
            }
        }
        
        return count;
    }
}