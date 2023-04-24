public class NQueens {
         // // N QUEENS : place queens in such a way that they can't attack each other in
      // chess board using recursion

      public static void nqueens(char board[][],int row){
      // base case
      if(row == board.length){
      printboard(board);
      return;
      }
      // column loop
      for(int j=0;j<board.length;j++){
      if(isSafe(board, row, j)){
      board[row][j] = 'Q';
      nqueens(board, row+1);

      } board[row][j] = 'X';
      }

      }
      public static boolean isSafe(char board[][],int row,int col){
      // vertical up
      for(int i=row-1;i>=0;i--){
      if(board[i][col] == 'Q'){
      return false;
      }
      }
       // diagonally left up
      for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--)
      {
      if(board[i][j] == 'Q'){
      return false;
      }
      }
      // diagonally right up
      for(int i = row-1,j = col+1;i>=0 && j<board.length;i--,j++){
      if(board[i][j] == 'Q'){
      return false;
      }
      }
      return true;
      }
      public static void printboard(char board[][]){
      System.out.println("-----------chess board------------");
      for(int i=0;i<board.length;i++){
      for(int j=0;j<board.length;j++){
      System.out.print(board[i][j] + " ");
      }System.out.println();
      }
      }
      public static void main(String args[]){
      int n=4;
      char board[][] = new char[n][n];
      //initialize
      for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
      board[i][j] = 'X';
      }
      }
      nqueens(board, 0);
      } 
}
