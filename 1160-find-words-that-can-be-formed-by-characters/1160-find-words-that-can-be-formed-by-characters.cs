public class Solution {
    public int CountCharacters(string[] words, string chars) {
        
        int res = 0;
        int[] arr1 = get_hash(chars);
        foreach(string s in words)
        {
            //string str = new string(s.OrderBy(c => c).ToArray());
            //Console.WriteLine(str+" "+ch);
            int[] arr2 = get_hash(s);
            int count = 0;
            for(int j=0;j<s.Length;j++)
            {
                if(arr1[s[j]-'a']>=arr2[s[j]-'a'])
                {
                    count++;
                }
            }
            if(count==s.Length)
            {
                res+=s.Length;
            }
            //Console.WriteLine(count);
            
        }
        
        return res;
        
    }
    public int[] get_hash(string s)
    {
        int[] arr = new int[26];
        for(int i=0;i<s.Length;i++)
        {
            arr[s[i]-'a']++;
        }
        
        return arr;
    }
}