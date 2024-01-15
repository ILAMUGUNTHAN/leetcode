public class Solution {
    public IList<IList<int>> FindWinners(int[][] matches) {
        IList<IList<int>> res = new List<IList<int>>();
        int[] hash1 = new int[100001];
        int[] hash2 = new int[100001];
        
        for(int i=0;i<matches.Length;i++)
        {
            hash1[matches[i][0]]++;
            hash2[matches[i][1]]++;
        }
        IList<int> sub1 = new List<int>();
        IList<int> sub2 = new List<int>();
        for(int i=0;i<matches.Length;i++)
        {
            if(hash2[matches[i][1]]==1)
            {
                if(!sub2.Contains(matches[i][1])) sub2.Add(matches[i][1]);
            }
            
            if(hash2[matches[i][0]]==0)
            {
                if(!sub1.Contains(matches[i][0])) sub1.Add(matches[i][0]);
            }
        }
        ((List<int>)sub1).Sort();
        ((List<int>)sub2).Sort();
        res.Add(sub1);
        res.Add(sub2);
        return res;
    }
}