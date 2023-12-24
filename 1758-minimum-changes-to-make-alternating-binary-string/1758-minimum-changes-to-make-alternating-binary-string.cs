public class Solution {
    public int MinOperations(string s) {
        
        int res = 0;
        
        for(int i=0;i<s.Length;i++)
        {
            if(s[i]-'0'!=i%2) res++;
        }
        
        return Math.Min(res,s.Length-res);
    }
}