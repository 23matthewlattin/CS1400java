import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class TicTacToeGui extends JPanel{
   private TicTacToe game = new TicTacToe();

   private JFrame window = new JFrame("Tic Tac Toe");
   private JTextArea txtTicTacToe = new JTextArea();
   private JLabel lblEnter = new JLabel(game.currentPlayer + " Turn");
   private JTextField txtLetter = new JTextField();
   private JButton btnTurn = new JButton("Enter");
   //add declare and intantiate tictactoe class
  
   
   public TicTacToeGui(){
      setLayout(null);
      
      txtTicTacToe.setBounds(10, 10, 450, 200);
      lblEnter.setBounds(10, 210, 100, 30);
      txtLetter.setBounds(120, 210, 100, 30);
      btnTurn.setBounds(230, 210, 100, 30);
      
      //add to window
      add(txtTicTacToe);
      add(lblEnter);
      add(txtLetter);
      add(btnTurn);
      window.add(this);
      
      window.setSize(450, 300);
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      window.setVisible(true);
      txtTicTacToe.setEnabled(false);
      
      txtTicTacToe.setText(game.toString());
      
      btnTurn.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
            lblEnter.setText(game.currentPlayer + " Turn");               
            String letter = txtLetter.getText();             
            game.move(letter);
            txtTicTacToe.setText(game.toString());              
            game.hasWon();
            if(game.hasWon() == true)
            {
               lblEnter.setText(game.currentPlayer + " has won");
               txtLetter.setText(game.currentPlayer + " has won");
               txtLetter.setEnabled(false);
            } 
            else
            { 
            game.switchPlayer();  
            txtLetter.setText("");
            lblEnter.setText(game.currentPlayer + " Turn");
            }                                    
         } 
      });
   }//end constructor
   
   public static void main(String []args){
      new TicTacToeGui();
   }
}//end class