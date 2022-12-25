class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer>map=new HashMap<Character,Integer>();
        int l=0,r=0,len1=0;
        int len=s.length();
        while(r<len){
             if(map.containsKey(s.charAt(r))){
                l=Math.max(map.get(s.charAt(r))+1,l);
                
            }
            map.put(s.charAt(r),r);
            len1=Math.max(len1,r-l +1);
            r++;
        }
        return len1;
        
    }
}
