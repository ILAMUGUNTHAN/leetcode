class Solution {
    public String reversePrefix(String word, char ch) {
        String res="";
        int ind=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                ind=i;
                break;
            }
        }
        StringBuilder sb=new StringBuilder(word.substring(0,ind+1));
        res+=(sb.reverse()).toString();
        if(ind<word.length()){
            res+=word.substring(ind+1);
        }
        return res;
        
    }
}