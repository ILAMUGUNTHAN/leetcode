class Solution {
    public int splitNum(int num) {
        List<Integer>list=new ArrayList<>();
        
        while(num>0){
            list.add(num%10);
            num/=10;
        } 
        Collections.sort(list);
        String min1="";
        String min2="";
        int ctr=0;
        for(int i:list)
        {
            if(ctr%2==0) min1+=Integer.toString(i);
            else min2+=Integer.toString(i);
            ctr++;
            
        }
        int sum=Integer.parseInt(min1)+Integer.parseInt(min2);
        return sum;
    }
}