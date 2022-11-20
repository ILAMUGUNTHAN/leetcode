class Solution {
    public int calculate(String s) {
        Deque<Integer>signs=new ArrayDeque<>();
        signs.add(1);
        int res=0;
        int sign=1;
        int cur=0;
        for(int i=0;i<s.length();i++){
            char currChar=s.charAt(i);
            if(Character.isDigit(currChar)){
                cur*=10;
                cur+=Character.getNumericValue(currChar);
            }
            else{
                res+=cur*sign;
                cur=0;
            }
            if(currChar=='-'){
                sign=signs.peek()*-1;
            }else if(currChar=='+'){
                sign=signs.peek();
            }else if(currChar=='('){
                signs.push(sign);
            }else if(currChar==')'){
                signs.pop();
            }
        }
        
        return res+ cur*sign;
    }
}