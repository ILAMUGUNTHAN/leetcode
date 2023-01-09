class Solution {
    public String defangIPaddr(String add) {
        String res="";
        for(int i=0;i<add.length();i++){
            if(add.charAt(i)=='.'){
                res+="[.]";
            }else{
                res+=add.charAt(i)+"";
            }
        }
        return res;
    }
}