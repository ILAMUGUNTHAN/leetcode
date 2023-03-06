class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        Set<Integer>set=new HashSet<>();
        for(int i:arr) set.add(i);
        int a=k;
        Stack<Integer>set2=new Stack<>();
        for(int i=1;i<=a;i++)
        {
            if(set.contains(i)) a++;
            else{
                set2.push(i);
            }
        }
        return set2.pop();
    }
}