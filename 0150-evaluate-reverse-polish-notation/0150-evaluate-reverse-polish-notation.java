class Solution {
    public int evalRPN(String[] str) {
        Stack<Integer>stack=new Stack<>();
        int sum1,sum2;
        for(String s:str){
            if(s.equals("+")){
                stack.add(stack.pop()+stack.pop());
            }else if(s.equals("/")){
                sum2=stack.pop();
                sum1=stack.pop();
                stack.add(sum1/sum2);
            }else if(s.equals("*")){
                stack.add(stack.pop()*stack.pop());
            }else if(s.equals("-")){
                sum2=stack.pop();
                sum1=stack.pop();
                stack.add(sum1-sum2);
            }else{
                stack.add(Integer.parseInt(s));
            }
        }
        return stack.pop();
        
    }
}