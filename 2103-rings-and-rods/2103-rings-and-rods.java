class Solution {
    public int countPoints(String rings) {
        int res = 0 ;
        int arr1[] = new int[10];
        int arr2[] = new int[10];
        int arr3[] = new int[10];
        for(int i=0;i<rings.length();i+=2)
        {
            if(rings.charAt(i)=='G' )
            {
                arr1[rings.charAt(i+1)-'0']++;
                
            }
            else if(rings.charAt(i)=='R' )
            {
                arr2[rings.charAt(i+1)-'0']++;
                
            }
            else if(rings.charAt(i)=='B' )
            {
                arr3[rings.charAt(i+1)-'0']++;
                
            }
        }
        
        for(int i=0;i<10;i++)
        {
            if(arr1[i]>0 && arr2[i]>0 && arr3[i]>0) res++;
        }
        return res;
        
        
    }
}