class Solution {
    public int[] getOrder(int[][] tasks) {
        int[][] t2=new int[tasks.length][3];
        for(int i=0;i<tasks.length;i++){
            t2[i][0]=i;
            t2[i][1]=tasks[i][0];
            t2[i][2]=tasks[i][1];
        }
        Arrays.sort(t2,(a,b)->a[1]-b[1]);
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->{
            if(a[2]==b[2]) return a[0]-b[0];
            return a[2]-b[2];
        });
        int time=t2[0][1];
        int ind=0;
        for(;ind<t2.length && t2[ind][1]<=time;ind++){
            pq.add(t2[ind]);
        }
        int itr=0;
        int[] ans=new int[tasks.length];
        while(!pq.isEmpty()){
            int[] task=pq.poll();
            ans[itr++]=task[0];
            time+=task[2];
            if(pq.isEmpty() && ind<tasks.length && t2[ind][1]>time){
                time=t2[ind][1];
            }
            for(;ind<t2.length && t2[ind][1]<=time;ind++){
                pq.add(t2[ind]);
            }
        }
        return ans;
    }
}