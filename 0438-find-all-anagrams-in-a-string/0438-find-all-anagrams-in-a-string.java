class Solution {
    public List<Integer> findAnagrams(String s, String p) {
      
        List<Integer>list=new ArrayList<>();
        int arrs[]=new int[26];
        int arrp[]=new int[26];
        if(s.length()<p.length()) return list;
        for(int i=0;i<p.length();i++){
            arrs[s.charAt(i)-'a']++;
            arrp[p.charAt(i)-'a']++;
        }
        for(int i=0;i<=s.length()-p.length();i++){
            boolean f=true;
            for(int j=0;j<26;j++){
                if(arrs[j]!=arrp[j]){
                    f=false;
                    break;
                }
            }
            if(f==true) list.add(i);
            arrs[s.charAt(i)-'a']--;
            if(i+p.length()<s.length()) arrs[s.charAt(i+p.length())-'a']++;
        }
        return list;
    }
}