class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int hash[]=new int[10000000];
        for(int i=0;i<arr.length;i++){
            hash[arr[i]+1000]++;
        }
        Set<Integer>set=new HashSet<>();
        Set<Integer>set2=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
            set2.add(hash[arr[i]+1000]);
        }
        if(set.size()==set2.size()) return true;
        
        return false;
    }
}