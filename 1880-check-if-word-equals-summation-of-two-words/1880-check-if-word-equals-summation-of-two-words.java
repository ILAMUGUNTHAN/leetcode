class Solution {
    public boolean isSumEqual(String first, String second, String target) {
        String one="",two="",tar="";
        for(char c:first.toCharArray()){
            one+=c-'a';
        }
        for(char c:second.toCharArray()){
            two+=c-'a';
        }
        for(char c:target.toCharArray()){
            tar+=c-'a';
        }
        if(Integer.parseInt(one)+Integer.parseInt(two)==Integer.parseInt(tar)) return true;
        return false;
    }
}