class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<Integer,String>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(i,arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            map.put(i,"");
            if(! map.containsValue(arr[i])) k--;
            if(k==0) return arr[i];
            map.put(i,arr[i]);
        }
        return "";
    }
}