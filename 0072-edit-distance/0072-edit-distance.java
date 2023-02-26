class Solution {
    public int minDistance(String word1, String word2) {
        
        int arr[][]=new int[word1.length()+1][word2.length()+1];
        
        for(int i=0;i<=word1.length();i++){
            for(int j=0;j<=word2.length();j++){
                if(i==0){
                    arr[i][j]=j;            
                }
                else if(j==0){
                    arr[i][j]=i;
                }
                else if(word1.charAt(i-1)==word2.charAt(j-1)){
                    arr[i][j]=arr[i-1][j-1];
                }else{
                    arr[i][j]=1+min(arr[i][j-1],arr[i-1][j],arr[i-1][j-1]);
                }
            }
        }
        return arr[word1.length()][word2.length()];

    }
    public int min(int a,int b, int c){
        return a<=b?a<=c?a:c:b<=c?b:c;
    }
}