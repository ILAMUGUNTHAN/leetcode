class Solution {
    public List<String> letterCasePermutation(String s) {
        return letterCasePermutation("",s);
    }
    private List<String> letterCasePermutation(String p,String up){
        if(up.isEmpty()){
            List<String> ans=new ArrayList<>();
            ans.add(p);
            return ans;
        }
        char ch=up.charAt(0);
        List<String>l=letterCasePermutation(p+ch,up.substring(1));
        if(ch>='a'&& ch<='z') l.addAll(letterCasePermutation(p+(char)(ch-'a'+'A'),up.substring(1)));
        else if(ch>='A'&& ch<='Z')
            l.addAll(letterCasePermutation(p+(char)(ch-'A'+'a'),up.substring(1)));
        return l;
    }
}