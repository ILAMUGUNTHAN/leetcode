class Solution {
    public int findCenter(int[][] edges) {
        int a1 = edges[0][0];
        int a2 = edges[0][1];
        int count1 = 0;
        int count2 = 0;
        for(int[] i : edges)
        {
            if(i[0] == a1 || i[1]==a1)
            {
                count1++;
            }
            if(i[0]==a2 || i[1]==a2)
            {
                count2++;
            }
        }
        
        if(count1>count2)
        {
            return a1;
        }
        
        return a2;
        

        
    }
}