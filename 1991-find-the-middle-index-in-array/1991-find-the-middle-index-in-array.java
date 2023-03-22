class Solution {
    public int findMiddleIndex(int[] nums) {
        int tot=0;
        int res=-1;
        for(int i:nums) tot+=i;
        
        int l=0;
        int r=tot;
            
        int ls[]=new int[nums.length];
        int rs[]=new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            ls[i]=l;
            
            l+=nums[i];
            
            r=(tot-l);
            rs[i]=r;
            
        }
        for(int i=0;i<nums.length;i++){
            if(ls[i]==rs[i]) {
                return i;
            }
            System.out.println(ls[i]+" "+rs[i]);
        }

        return res;
        
    }
}