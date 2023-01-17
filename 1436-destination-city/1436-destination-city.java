class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> set=new HashSet<>();
        for(List<String> i:paths){
            set.add(i.get(0));
        }
        for(List<String> i:paths){
            String s=i.get(1);
            if(!set.contains(s)){
                return s;
            }
        }
        return "";
    }
}