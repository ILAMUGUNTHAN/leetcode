public class Solution {
    public int MinSteps(string s, string t) {
        int res = 0;
        int[] hash = new int[26];
        for(int i=0;i<s.Length;i++)
        {
            hash[s[i]-'a']++;
            hash[t[i]-'a']--;
        }
        
        for(int i=0;i<26;i++)
        {
            if(hash[i]>0) res+=hash[i];
        }
        
        return res;
    }
}