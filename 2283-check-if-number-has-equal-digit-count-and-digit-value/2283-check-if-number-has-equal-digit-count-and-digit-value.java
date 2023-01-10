class Solution {
    public boolean digitCount(String num) {
        int hash[]=new int[10];
        for(char c:num.toCharArray()){
            hash[c-'0']++; 
        }
        for(int i=0;i<num.length();i++){
            if(hash[i]!=Integer.parseInt(num.charAt(i)+"")) return false;
        }
        return true;
    }
}