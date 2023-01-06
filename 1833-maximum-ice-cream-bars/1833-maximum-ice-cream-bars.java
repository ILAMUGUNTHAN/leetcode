class Solution {
    public int maxIceCream(int[] costs, int coin) {
        Stack<Integer>stack=new Stack<>();
        Arrays.sort(costs);
        for(int i=costs.length-1;i>=0;i--){
            stack.push(costs[i]);
        }
        int res=0;
        while(!stack.isEmpty()){
            if(stack.peek()<=coin){
                res++;
                coin-=stack.pop();
                System.out.println(coin);
            }else return res;
        }
        return res;
    }
}