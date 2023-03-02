class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer>map1=new HashMap<>();
        String res=" ";
        for(String s:s1.split(" "))
        {
            if(map1.containsKey(s))
            {
                map1.put(s,map1.get(s)+1);
            }
            else
            {
                map1.put(s,1);
            }
        }
        for(String s:s2.split(" "))
        {
            if(map1.containsKey(s))
            {
                map1.put(s,map1.get(s)+1);
            }
            else
            {
                map1.put(s,1);
            }
        }
        
        for(String s:s1.split(" "))
        {
            if(map1.get(s)==1)
            {
                res+=s+" ";
            }
            
        }
        for(String s:s2.split(" "))
        {
            if(map1.get(s)==1)
            {
                res+=s+" ";
            }
        }
        if(res.length()>1) res=res.trim();
        return res.split(" ");
        
    }
}