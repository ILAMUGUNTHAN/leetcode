class Solution {
    Map<Character,Integer>map=new TreeMap<>();

    public boolean isAlienSorted(String[] words, String order) {
        for(int i=0;i<26;i++){
            map.put(order.charAt(i),i);
        }
        for(Map.Entry i:map.entrySet()){
            //System.out.println(i.getKey()+" "+i.getValue());
        }
        for(int k=0;k<words.length-1;k++){
            String str=words[k];
            String str2=words[k+1];
            if(!check(str,str2)) return false;

        }
        return true;
    }
    public boolean check(String str,String str2){
        
        for(int i=0,j=0;i<str.length()&&j<str2.length();i++,j++){
            if(str.charAt(i)!=str2.charAt(j)){
                if(map.get(str.charAt(i))>map.get(str2.charAt(j))){
                    return false;
                }else {
                    return true;
                }
            }
        }
        if(str.length()>str2.length()) return false;
        return true;
    }
}