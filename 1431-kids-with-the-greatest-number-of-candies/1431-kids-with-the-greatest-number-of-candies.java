class Solution {
    public List<Boolean> kidsWithCandies(int[] can, int extra) {
        int max=can[0];
        for(int i=1;i<can.length;i++){
            max=Math.max(max,can[i]);
        }
        List<Boolean>res=new ArrayList<>();
        for(int i=0;i<can.length;i++){
            if(can[i]+extra >=max){
                res.add(true);
            }else {
                res.add(false);
            }
        }
        return res;
    }
}