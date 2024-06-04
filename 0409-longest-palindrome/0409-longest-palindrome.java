class Solution {
    public int longestPalindrome(String s) {
        Set<Character>set=new HashSet<>();
        int sum=0;
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                set.remove(s.charAt(i));
                sum++;
            }else{
                set.add(s.charAt(i));
            }
        }
        if(!set.isEmpty()) return sum*2 +1;
        return sum*2;
    }
}