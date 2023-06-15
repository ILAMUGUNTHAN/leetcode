class Solution {
    int c=0;
    public int numberOfSteps(int num) {
        count(num);
        return c;
    }
    public void count(int n){
        if(n==0) return;
        if(n%2==0){
            c++;
            count(n/2);
        }else {
            c++;
            count(n-1);
        }
    }
}