import javax.swing.*;
import java.util.*;
import java.awt.event.*;

class GumballGuessGUI extends JPanel{
   //Windows Components
   private JFrame window = new JFrame("Gumball Guess");
   private JLabel lblName = new JLabel("Name: " ); 
   private JLabel lblGuess = new JLabel("Guess " );
   private JTextField txtName = new JTextField(""); 
   private JTextField txtGuess = new JTextField("");
   private JLabel lblStats = new JLabel("Winner");
   private JButton btnGuess = new JButton("Add Guess");
   private JButton btnCheckWinner = new JButton("Show Winner");
   //one way to put in image is to use label
   private JLabel lblImage = new JLabel(new ImageIcon( getClass().getResource("Gumball.jpg")));  
   //nedd to find image to use
   //image needs to be on same folder as this file
  
  
   //Random Generator
   private Random gen = new Random();
   //add class variables
   //set a random number
   private int numberOfCandy = gen.nextInt(200) + 200;
   //create a list of guesses, this will store one instance of the class at each index of the array list
   private ArrayList<Guess>guessList = new ArrayList<Guess>();
 
   
   //Constructor
   public GumballGuessGUI(){
      //Null layout for absolute positioning
      setLayout(null);
      //Set Absolute positioning
      lblName.setBounds(10, 10, 100, 30);
      txtName.setBounds(120, 10, 150, 30);
      lblGuess.setBounds(10, 50, 100, 30);
      txtGuess.setBounds(120, 50, 150, 30);
      btnGuess.setBounds(160, 90, 110, 30);
      lblStats.setBounds(10, 140, 300, 60);
      btnCheckWinner.setBounds(160, 220, 110, 30);
      //add position for image
      lblImage.setBounds(230, 10, 180, 200);
   
      //Add components to window
      add(lblName);
      add(txtName);
      add(lblGuess);
      add(txtGuess);
      add(btnGuess);
      add(lblStats);
      add(btnCheckWinner);
      //add image
      add(lblImage);
      
      //Exit program when window closes
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      window.setSize(500, 400);
      window.add(this);
      window.setVisible(true);
      
      //Event for btnGuess
      btnGuess.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e){
         
         //gets the name from the textbox
         String name = txtName.getText();
         //get the guess - have to convert from text
         int guess = Integer.parseInt(txtGuess.getText());
         //now can create instance of guess class
         Guess g = new Guess(name, guess);
         //add the instance of the class to the arraylist
         guessList.add(g);
         
         //omce added clear out text boxes
         txtName.setText("");
         txtGuess.setText("");         
         }
      });


      btnCheckWinner.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e){
         
         //start with the first person in list and assume they are winner, try to disprove it
         Guess winner = guessList.get(0);
         //get the clossest dist to the number of candy in the jar - use absoult value so always positive
         int closestDist = Math.abs(winner.getGuess() - numberOfCandy);
         
         //for each to go through each instance fo the guess calss that was added to the arraylist
         for(Guess g: guessList)
         {
            int dist = Math.abs(g.getGuess() - numberOfCandy);
            if(dist < closestDist)
            {
               //set the winner to be the closest on efound 
               winner = g;
              //reset closest dist to closeer one found
              closestDist = dist;
            }//end if
            
         }//end for
         
         //display winner
         lblStats.setText("<html>The winner is " + winner.toString() + "<br>Candy: " + numberOfCandy + "<html>");
         }
      });

   }    
   
   public static void main(String [] args){
      new GumballGuessGUI();
   }
}