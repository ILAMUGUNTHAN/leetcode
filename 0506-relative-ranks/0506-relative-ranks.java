class Solution {
    public String[] findRelativeRanks(int[] score) {
        String str[]=new String[score.length];
        int arr[]=score.clone();
        Arrays.sort(score);
        Map<Integer,String>map=new HashMap<>();
        map.put(score[score.length-1],"Gold Medal");
        if(score.length>1)
            map.put(score[score.length-2],"Silver Medal");
        if(score.length>2)
            map.put(score[score.length-3],"Bronze Medal");
        
        for(int i=score.length-4;i>=0;i--){
            map.put(score[i],Integer.toString(score.length-i));
        }
        int ind=0;
        for(int i:arr){
            str[ind++]=map.get(i);
        }
        return str;
        
    }
}