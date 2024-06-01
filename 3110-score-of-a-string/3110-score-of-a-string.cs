public class Solution {
    public int ScoreOfString(string s) {
        int res = 0;
        for(int i=1;i<s.Length;i++)
        {
            res+=Math.Abs(s[i]-s[i-1]);
        }
        
        return res;
    }
}