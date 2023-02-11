class Solution {
    public int countBalls(int low, int high) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=low;i<=high;i++){
            int k=i;
            int n=0;
            while(k>0){
                n+=k%10;
                k/=10;
            }
            if(map.containsKey(n)){
                map.put(n,map.get(n)+1);
            }else {
                map.put(n,1);
            }
        }
        int max=0;
        for(int i:map.keySet()){
            if(map.get(i)>max){
                max=map.get(i);
            }
        }
        return max;
    }
}