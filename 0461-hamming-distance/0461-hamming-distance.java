class Solution {
    public int hammingDistance(int x, int y) {
        String str1 = "";
        String str2 = "";
        while(x>0 || y>0){
            str1+=x%2+"";
            str2+=y%2+"";
            x/=2;
            y/=2;
        }
        System.out.println(str1+" "+str2);
        int res=0;
        for(int i=0;i<str1.length();i++){
            if(str2.charAt(i)!=str1.charAt(i)) res++;
        }
        return res;
    }
}