public class Solution {
    public void ReverseString(char[] s) {
        int len = s.Length-1;
        for(int i=0;i<s.Length/2;i++)
        {
            char temp = s[i];
            s[i] = s[len];
            s[len] = temp;
            len--;
        }
    }
}