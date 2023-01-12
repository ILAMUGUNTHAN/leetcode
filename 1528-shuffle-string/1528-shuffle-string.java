class Solution {
    public String restoreString(String s, int[] indices) {
        Map<Integer,Character> map=new HashMap<>();
        String res="";
        for(int i=0;i<s.length();i++){
            map.put(indices[i],s.charAt(i));
        }
        for(int i=0;i<s.length();i++){
            res+=map.get(i);
        }
        return res;
    }
}