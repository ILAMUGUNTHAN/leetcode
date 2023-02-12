class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
       
        List<Integer>list=new ArrayList<>();
        Map<Integer,Integer> map=new LinkedHashMap<>();
        Map<Integer,Integer>map2=new HashMap<>();
        Map<Integer,Integer>map3=new HashMap<>();
        Map<Integer,Integer>MAP=new HashMap<>();
        for(int i:nums1){
            
            map.put(i,1);
            MAP.put(i,1);
            
        }
        for(int i:nums2){
            map2.put(i,1);
            MAP.put(i,1);
        }
        for(int i:nums3) {
            map3.put(i,1);
            MAP.put(i,1);
        }
        System.out.print(map2.keySet());
        for(Integer i:MAP.keySet()){
            if((map.containsKey(i) && map2.containsKey(i))) list.add(i);
            else if(map2.containsKey(i) && map3.containsKey(i)) list.add(i);
            else if(map.containsKey(i) && map3.containsKey(i)) list.add(i);
        }
        return list;
    }
}