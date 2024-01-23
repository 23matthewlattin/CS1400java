import java.util.*;

class TicTacToe{
 
   String currentPlayer = "X"; 
   int moveNumber = 1;
  private String [][] board = {
      {"A", "B", "C"},
      {"D", "E", "F"},
      {"G", "H", "I"}
   };
   public String switchPlayer(){
      //if/else switching current player
      if(currentPlayer == "X"){
         currentPlayer = "O";
      }
      else{
         currentPlayer = "X";
      } 
      return currentPlayer;  
   }
   public String getPlayer(){
      return currentPlayer;
   }
   public void move(String letter){
      moveNumber ++;
      for(int r = 0; r < board.length; r++){
         for(int c = 0; c < board[0].length; c++){
            if(board[r][c].equalsIgnoreCase(letter)){
               board[r][c] = currentPlayer;
            }
         }//end inner for
      }//end outer for
      
   }//end move
   
   public boolean hasWon(){
      int across = 0;
      int down = 0; 
      int diagRight = 0;
      int diagLeft = 0;
      for(int r = 0; r < board.length; r++){
         for(int c = 0; c < board[0].length; c++){
            if(board[r][c].equals(currentPlayer)){
               across++;
            }
         }//end inner for
         if(across < 3){
         across = 0; 
         }
      }//end outer for 
       
      for(int c = 0; c < board[0].length; c++){
         for(int r = 0; r < board.length; r++){
            if(board[r][c].equals(currentPlayer)){
               down++;
            }
         }//end inner for
         if(down != 3){
            down = 0;
         }
      }//end outer for
      for(int r = 0; r < board.length; r++){
            if(board[r][r].equalsIgnoreCase(currentPlayer)){
               diagLeft ++;
            }
            if(board[2-r][r].equalsIgnoreCase(currentPlayer)){
               diagRight ++;
            }
      }//end outer for 
      if(diagRight == 3 || diagLeft ==3 || across == 3 || down == 3)
      {
         return true;
      }
      else
      {
         return false;
      }
   }//end hasWon
   public String toString(){
      String str = "";
      for(int r = 0; r < board.length; r++){
         for(int c = 0; c < board[0].length; c++){
            str += board[r][c] + "  ";
            }
            str += '\n';
      }//end outer loop 
      return str;  
   }//end toString
}//end TicTactoe