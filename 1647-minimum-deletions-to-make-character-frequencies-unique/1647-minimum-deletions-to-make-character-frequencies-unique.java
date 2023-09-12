class Solution {
    public int minDeletions(String s) {
        int arr[] = new int[26];
        int ans = 0;
        for(int i=0;i<s.length();i++)
        {
            arr[s.charAt(i)-'a']++;
        }
        Set<Integer> set = new HashSet<>();
        for(int i:arr)
        {
            while(i!=0 && set.contains(i))
            {
                ans++;
                i--;
            }
            set.add(i);
        }
        return ans;
    }
}