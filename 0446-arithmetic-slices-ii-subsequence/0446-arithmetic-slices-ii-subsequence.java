class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int ans=0;
        Map<Integer,Integer>[] map=new Map[nums.length];
        for(int i=0;i<nums.length;i++){
            map[i]=new HashMap<>(i);
            for(int j=0;j<i;j++){
                long dif=(long)nums[i]-nums[j];
                if(dif<=Integer.MIN_VALUE || dif>Integer.MAX_VALUE) continue;
                int d=(int) dif;
                int c1=map[i].getOrDefault(d,0);
                int c2=map[j].getOrDefault(d,0);
                ans+=c2;
                map[i].put(d,c1+c2+1);
            }
        }
        return ans;
        
    }
}