class Solution {
    boolean isUpper(String s){
        for(int i=0;i<s.length();i++){
            if(Character.isLowerCase(s.charAt(i))){
                return false;
            }
        }
        return true;
    }
    boolean isLower(String s){
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){
                return false;
            }
        }
        return true;
    }
    public boolean detectCapitalUse(String word) {
        if(isUpper(word)||isLower(word)) return true;
        for(int i=1;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))) return false;
        }
        return true;
    }
}