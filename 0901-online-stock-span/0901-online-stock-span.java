class StockSpanner {
    
    Stack<Pair<Integer,Integer>> st=new Stack<>();
    

    public StockSpanner() {
        
    }
    
    public int next(int price) {
        int res=1;
        while(!st.isEmpty() && st.peek().getKey()<=price){
            res+=st.pop().getValue();
            
        }
        Pair<Integer,Integer> pair=new Pair<>(price,res);
        st.push(pair);
        return pair.getValue();
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */