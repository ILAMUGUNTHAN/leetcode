class Solution {
    public String getPermutation(int n, int k) {
        String s="";
        int f=1;
        List<Integer>nums=new ArrayList<>();
        for(int i=1;i<n;i++){
            f=f*i;
            nums.add(i);
        }
        nums.add(n);
        k=k-1;
        while(true){
            s=s+nums.get(k/f);
            nums.remove(k/f);
            if(nums.size()==0) break;
            
            k=k%f;
            f=f/nums.size();
        }
        return s; 
    }
}