public class Solution {
    public int MinTimeToVisitAllPoints(int[][] p) {
        
        int res = 0;
        
        HashSet<int[]> s = new HashSet<int[]>(); 
        for(int i=0;i<p.Length;i++)
        {
            s.Add(new int[]{p[i][0],p[i][1]});
        }
        
        int[][] points = new int[s.Count][];
        
        int ind=0;
        foreach(int[] arr in s)
        {
            points[ind] = new int[2];
            points[ind][0] = arr[0];
            points[ind++][1] = arr[1];
        }
        Console.WriteLine(p.Length+" "+s.Count);
        for(int i=0;i<points.Length-1;i++)
        {
            int x1 = points[i][0];
            int y1 = points[i][1];
            
            int x2 = points[i+1][0];
            int y2 = points[i+1][1];
            
            int val = int.MinValue;
            
            if(x1>x2)
            {
                val = Math.Max(val,(x1-x2));
            }
            if(y1>y2)
            {
                val = Math.Max(val,(y1-y2));
            }
            
            if(x1<x2)
            {
                val = Math.Max(val,(x2-x1));
            }
            if(y1<y2)
            {
                val = Math.Max(val,(y2-y1));
            }
            res += val;
         
        }
        
        return res;
    }
}