public class Solution {
    public bool IsAnagram(string s, string t) {
        int[] hash = new int[26];
        int[] hash2 = new int[26];
        if(s.Length!=t.Length) return false;
        
        for(int i=0;i<s.Length;i++)
        {
            hash[s[i]-'a']++;
            
        }
        for(int i=0;i<s.Length;i++)
        {
            hash2[t[i]-'a']++;
        }
        
        for(int i=0;i<s.Length;i++)
        {
            if(hash[s[i]-'a']!=hash2[s[i]-'a']) return false;
        }
        
        return true;
    }
}