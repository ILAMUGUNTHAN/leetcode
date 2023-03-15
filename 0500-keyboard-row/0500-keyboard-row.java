class Solution {
    public String[] findWords(String[] words) {
        String one="EIOPQRTUWYeiopqrtuwy";
        String two="ADFGHJKLSadfghjkls";
        String three="BCMNVXZbcmnvxz";
        char ONE[]=one.toCharArray();
        char TWO[]=two.toCharArray();
        char THREE[]=three.toCharArray();
        Arrays.sort(ONE);
        Arrays.sort(TWO);
        Arrays.sort(THREE);
        
        Set<Character>set1=new HashSet<>();
        Set<Character>set2=new HashSet<>();
        Set<Character>set3=new HashSet<>();
        
        for(char c:ONE){
            set1.add(c);
        }
        for(char c:TWO){
            set2.add(c);
        }
        for(char c:THREE){
            set3.add(c);
        }
        
        // String one1=new String(ONE);
        // String two1=new String(TWO);
        // String three1=new String(THREE);
        List<String>list=new ArrayList<>();
        
        int ind=0;
        
        for(String s:words){
            int count1=0,count2=0,count3=0;
            for(int i=0;i<s.length();i++){
                if(set1.contains(s.charAt(i))){
                    count1++;
                }else if(set2.contains(s.charAt(i))){
                    count2++;
                }
                else if(set3.contains(s.charAt(i))){
                    count3++;
                }
            }
            if(count1==s.length()|| count2==s.length() || count3==s.length()){
                list.add(s);
            }
        }
        String res[]=new String[list.size()];
        for(String s:list) res[ind++]=s;
        return res;
    }
}