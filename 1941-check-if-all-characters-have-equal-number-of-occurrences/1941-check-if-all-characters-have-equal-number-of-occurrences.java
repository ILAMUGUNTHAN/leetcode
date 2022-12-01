class Solution {
    public boolean areOccurrencesEqual(String s) {
        int hash[]=new int[26];
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i)-'a']++;
        }
        Set<Integer>set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            set.add(hash[s.charAt(i)-'a']);
        }
        if(set.size()==1) return true;
        return false;
    }
}