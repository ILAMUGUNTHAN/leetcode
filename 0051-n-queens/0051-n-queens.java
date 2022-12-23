class Solution {
    public List<List<String>> solveNQueens(int n) {
        
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        int[] l=new int[n];
        int[] up=new int[2*n -1];
        int[] low=new int[2*n -1];
        List<List<String>> ans=new ArrayList<>();
        sol(0,board,ans,l,up,low);
        return ans;
    }
    public void sol(int col,char[][] board,List<List<String>>ans,int[]leftrow,int[]up,int[]low){
        if(col==board[0].length){
            ans.add(construct(board));
            return ;
        }
        for(int i=0;i<board.length;i++){
            if(leftrow[i]==0 && up[board.length-1 + col-i]==0 &&low[i+col]==0){
                leftrow[i]=1;
                up[board.length-1 +col-i]=1;
                low[i+col]=1;
                board[i][col]='Q';
                sol(col+1,board,ans,leftrow,up,low);
                leftrow[i]=0;
                up[board.length-1 + col-i]=0;
                low[i+col]=0;
                board[i][col]='.';
            }
        }
    }
    public List<String>construct(char[][] board){
        List<String>res=new ArrayList<>();
        for(int i=0;i<board.length;i++){
            String s=new String(board[i]);
            res.add(s);
        }
        return res;
    }
}