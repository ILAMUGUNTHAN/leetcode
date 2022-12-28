class Solution {
    public int minStoneSum(int[] piles, int k) {

        Queue<Integer>list=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:piles) list.add(i);
        while(k-->0){
            int a=list.poll();
            int x=a/2;
            list.add(a-x);
          
        }
        
        int ans=0;
        for(int i:list) ans+=i;
        return ans;
    }
}