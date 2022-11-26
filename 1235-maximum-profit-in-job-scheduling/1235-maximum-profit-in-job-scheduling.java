class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int t[][]=new int[startTime.length][4];
        for(int i=0;i<startTime.length;i++){
            t[i][0]=startTime[i];
            t[i][1]=endTime[i];
            t[i][2]=profit[i];
        }
        Arrays.sort(t,(a,b)->a[1]-b[1]);
        int ans=0;
        TreeMap<Integer,Integer>map=new TreeMap();
        for(int i=0;i<t.length;i++){
            Integer temp=map.floorKey(t[i][0]);
            int pro=temp==null?0:map.get(temp);
            ans=Math.max(ans,t[i][2]+pro);
            map.put(t[i][1],ans);
        }
        return ans;
    }
}