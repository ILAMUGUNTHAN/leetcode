class Solution {
    public String sortSentence(String s) {
        String str[]=s.split(" ");
        int ind=0;
        String res="";
        while(ind<str.length){
            for(int i=0;i<str.length;i++){
                if(str[i].charAt(str[i].length()-1)-49==ind){
                    res+=str[i].substring(0,str[i].length()-1)+" ";
                    ind++;

                }

            }
        }
        
        return res.trim();
    }
}