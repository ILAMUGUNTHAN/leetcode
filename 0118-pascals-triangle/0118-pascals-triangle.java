class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> pre = null;
        for(int i=0;i<n;i++)
        {
            List<Integer> cur = new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(j==0|| j==i)
                {
                    cur.add(1);
                }else{
                    cur.add(pre.get(j-1)+pre.get(j));
                }
            }
            pre = cur;
            ans.add(pre);
        }
        return ans;
    }
}