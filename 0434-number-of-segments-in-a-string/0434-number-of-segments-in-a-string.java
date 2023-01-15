class Solution {
    public int countSegments(String s) {
        int count=0;
        String str[]=s.split(" ");
        for(String i:str){
            if(!Objects.equals(i,"")) count++;
        }
        return count;
    }
}