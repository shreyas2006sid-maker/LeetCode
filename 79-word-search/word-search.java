class Solution {
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(f(board,word,i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }
    boolean f(char[][] b,String w,int row,int col,int index){
        if(index==w.length()){
            return true;
        }
        if(row<0||col<0||row>=b.length||col>=b[0].length||b[row][col]!=w.charAt(index))return false;
        char temp=b[row][col];
        b[row][col]='#';
        boolean found=
        f(b,w,row+1,col,index+1)||
        f(b,w,row-1,col,index+1)||
        f(b,w,row,col+1,index+1)||
        f(b,w,row,col-1,index+1);

        b[row][col]=temp;

        return found;
    }
}