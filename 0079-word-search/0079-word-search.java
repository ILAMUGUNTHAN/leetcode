class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    if(check(board,word,0,i,j,board.length,board[0].length)) return true;
                }
            }
        }
        return false;
        
    }
    boolean check(char[][] board,String word,int index,int i,int j,int r,int c){
        if(index==word.length()){
            return true;
        }
        if(i<0|| j<0||i==r||j==c||board[i][j]!=word.charAt(index)) return false;
        char temp=board[i][j];
        board[i][j]='#';
        boolean a1=check(board,word,index+1,i,j+1,r,c);
        boolean a2=check(board,word,index+1,i+1,j,r,c);
        boolean a3=check(board,word,index+1,i-1,j,r,c);
        boolean a4=check(board,word,index+1,i,j-1,r,c);
        board[i][j]=temp;
        return a1||a2||a3||a4;
    }
}