class Solution {
    public int numTilings(int n) {
        int m=1000000007;
        if(n<=2) return n;
        
        long arr[]=new long[n+1];
        arr[0]=1;
        arr[1]=1;
        arr[2]=2;
        for(int i=3;i<=n;i++){
            arr[i]=(arr[i-1]*2 +arr[i-3])%m;
        }
        return (int)arr[n];
    }
}