class Solution {
    public int countConsistentStrings(String all, String[] words) {
        int count=0;
        Map<Integer,Character> map=new HashMap<>();
        for(int i=0;i<all.length();i++){
            map.put(i,all.charAt(i));
        }
        for(String s:words){
            int c=0;
            for(int i=0;i<s.length();i++) {
                if(map.containsValue(s.charAt(i))) c++;
            }
            if(c==s.length()) count++;
        }
        return count;
    }
}