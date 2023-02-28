class Solution {
    public String truncateSentence(String s, int k) {
        String res="";
        String str[]=s.split(" ");
        for(String str1:str){
            res+=str1+" ";
            k--;
            if(k==0) break;
        }
        return res.trim();
    }
}