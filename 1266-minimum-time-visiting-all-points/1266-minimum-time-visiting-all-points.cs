public class Solution {
    public int MinTimeToVisitAllPoints(int[][] points) {
        
        int res = 0;

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