public class queens_bt1{
    public static void Boardprint(char board[][]){
        System.out.println("-----------chess board--------");
         for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void Queensrow(char board[][], int row){
        if(row==board.length){
            Boardprint(board);
            return;
        }

        for(int i=0;i<board.length;i++){
            board[row][i]='Q';
            Queensrow(board,row+1);
            board[row][i]='X';
        }
    }

    public static void main(String args[]){
        int n=2;
        char board[][]=new char[n][n];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j]='X';
            }
        }
        Queensrow(board,0);
    }
}