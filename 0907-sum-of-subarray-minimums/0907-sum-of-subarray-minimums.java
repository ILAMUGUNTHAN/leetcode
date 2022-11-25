class Solution {
    public int sumSubarrayMins(int[] arr) {
        int sum=0;
        Stack<Integer>stack=new Stack<>();
        long M=(long)1000000007;
        stack.push(-1);
        for(int i=0;i<arr.length+1;i++){
            int cur=(i<=arr.length-1)?arr[i]:0;
            while(stack.peek()!=-1&&cur<arr[stack.peek()]){
                int index=stack.pop();
                int j=stack.peek();
                int l=index-j;
                int r=i-index;
                long add=(l*r*(long)arr[index])%M;
                sum+=add;
                sum%=M;
                
            }
            stack.push(i);
        } 
        return sum;
        
    }
}