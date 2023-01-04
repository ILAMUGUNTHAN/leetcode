class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:tasks){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int ans=0;
        for(int i:map.values()){
            if(i==1) return -1;
            ans+=(i+2)/3;
        }
        return ans;
    }
}