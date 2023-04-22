class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        
        List<List<Integer>>res = new ArrayList<>();
        Map<Integer,Integer>map=new TreeMap<>();
        
        for(int i=0;i<items1.length;i++){
            if(map.containsKey(items1[i][0])){
                map.put(items1[i][0],map.get(items1[i][0])+items1[i][1]);
            }
            else {
                map.put(items1[i][0],items1[i][1]);
            }
        }
        for(int i=0;i<items2.length;i++){
            if(map.containsKey(items2[i][0])){
                map.put(items2[i][0],map.get(items2[i][0])+items2[i][1]);
            }
            else {
                map.put(items2[i][0],items2[i][1]);
            }
        }
        for(Map.Entry<Integer,Integer> en: map.entrySet()){
            res.add(Arrays.asList(en.getKey(),en.getValue()));
        }        
        return res;
        
        
    }
}