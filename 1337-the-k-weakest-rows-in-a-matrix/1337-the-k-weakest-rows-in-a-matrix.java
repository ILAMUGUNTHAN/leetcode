import java.util.*;
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<mat.length;i++)
        {
            int count=0;
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]==1) count++;
            }
            map.put(i,count);
        }
        Map<Integer,Integer> sortMap =  map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
        
        Collection<Integer> c = sortMap.keySet();
        
        int res[] = new int[k];
        
        
        
        int ind=0;
        for(int i:c){
            if(ind==k) break;

            res[ind++]=i;
        }
        return res;
    }
}