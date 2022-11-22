class Solution {
    public void moveZeroes(int[] nums) {
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0) stack.push(nums[i]);
        }
        int res[]=new int[nums.length];
        Collections.reverse(stack);
        int ind=0;
        while(!stack.isEmpty()){
            res[ind++]=stack.pop();
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=res[i];
        }
        
        
    }
}