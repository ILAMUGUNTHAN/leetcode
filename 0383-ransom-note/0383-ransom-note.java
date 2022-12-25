class Solution {
    public boolean canConstruct(String r, String m) {
        StringBuilder sb=new StringBuilder(m);
        int count=0;
        if(r.length()>m.length()){
            return false;
        }
        for(int i=0;i<r.length();i++){
            for(int j=0;j<sb.length();j++){
                if(r.charAt(i)==sb.charAt(j)){
                    sb.deleteCharAt(j);
                    count++;
                    break;
                }
            }
        }
        if(count==r.length()) return true;
        return false;
    }
}