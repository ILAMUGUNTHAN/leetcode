class Solution {
    public String makeGood(String s) {
        Stack <Character> stack=new Stack<Character>();
        stack.push(s.charAt(0));

        for(int i=1;i<s.length();i++){
            if(!stack.isEmpty() && Math.abs(stack.peek()-s.charAt(i))==32 ){
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }

        Iterator<Character> it=stack.iterator();
        StringBuilder res=new StringBuilder("");
        while(!stack.isEmpty()){
            res.append(stack.pop());
        }
        return (res.reverse()).toString();
    }
}