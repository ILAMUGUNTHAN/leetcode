
public class Solution {
    public string DecodeAtIndex(string s, int K) {
        
        long tot_len = 0;
        long k = K;
        for(int i=0;i<s.Length;i++)
        {
            if(char.IsDigit(s[i]))
            {
                tot_len = tot_len*(s[i]-'0');
            }
            else
            {
                tot_len++;
            }
        }
        
        for(int i=s.Length-1;i>=0;i--)
        {
            if(char.IsDigit(s[i]))
            {
                tot_len = tot_len/(s[i]-'0');
                k %= tot_len;
            }
            else
            {
                if(k==0 || k==tot_len)
                {
                    return s[i]+"";
                }
                tot_len--;
            }
        }
        
        return "";
        
            
    }
}