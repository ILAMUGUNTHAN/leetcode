class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for(int i:nums1) set1.add(i);
        
        for(int i:nums2) set2.add(i);
        List<Integer>list= new ArrayList<>();
        for(int i:set1){
            if(!set2.contains(i)){
                list.add(i);
            }
        }

        ans.add(list);
        List<Integer>list2 = new ArrayList<>();
        for(int i:set2){
            if(!set1.contains(i)){
                list2.add(i);
            }
        }
        ans.add(list2);
        
        return ans;
        
    }
}