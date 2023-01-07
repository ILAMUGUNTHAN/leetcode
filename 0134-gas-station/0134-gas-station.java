class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int g=0,c=0;
        for(int i=0;i<gas.length;i++){
            g+=gas[i];
            c+=cost[i];
        }
        if(g<c) return -1;
        int ans=0,val=0;
        for(int i=0;i<gas.length;i++){
            val=val+(gas[i]-cost[i]);
            if(val<0){
                ans=i+1;
                val=0;
            }
        }
        return ans;
        
    }
}