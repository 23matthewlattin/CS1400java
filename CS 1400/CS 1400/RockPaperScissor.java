import java.util.Scanner;
import java.util.Random;

class RockPaperScissor
{
   /* costants never change instead of 
   keeping track of 1, 2, and 3 we assign constant variables.They are in all caps, this is code style so that we know what varibles
   are constant */
   final static int ROCK = 1;
   final static int PAPER = 2;
   final static int SCISSORS = 3;
   
    public static void main (String args [])
    {
      //instatiate classes Scanner and random
      Scanner input = new Scanner(System.in);
      Random gen = new Random();
      
      //variables
      int userChoice, computerChoice;
      
      System.out.println("Rock Paper Scissors Game!");
      
      // loop for code to repeat the game
      do
      {
         //call method for menu
         menu(); // method call -- method cant be inside the main
         userChoice = input.nextInt();
         
         if(userChoice == 4)
         break;
         
         //set computer choice
         computerChoice = gen.nextInt(3) + 1; //get random number between 1 and 3
         
         //System.out.println("You chose " + choice //this would only show number
         System.out.println("You chose " + convertChoice(userChoice));
         System.out.println( "Computer chosse " + convertChoice(computerChoice));
         
         //determine winner
         System.out.println(pickWinner(userChoice, computerChoice));
         
      }while(userChoice <= 3);
    }// end main
    
    //menu method
    public static void menu()
    { 
      System.out.println("1 = Rock");
      System.out.println("2 = Paper");
      System.out.println("3 = Scissors");
      System.out.println("4 = quit");
    }
    
    // convert number choice to string(rock, paper or scissors
    public static String convertChoice(int choice)
    {
      
      //use constants to detemine which choice to use
      if(choice == ROCK)
      {
         return "Rock";
      }
      else if(choice == PAPER)
      {
         return "Paper";
      }
      else
      {
         return "Scissors"; //using as defualt when we are assumeing no user error
      }
    
    }
    
    //calcualte the result of the game win lose or tie
    //need to know both choices 2 parameters
    // returning who won - String
    public static String pickWinner(int userChoice, int computerChoice)
    {
      if(userChoice == computerChoice)
      {
         return "Tie";
      }
      else if(userChoice == ROCK && computerChoice == SCISSORS ||
               userChoice == PAPER && computerChoice == ROCK ||
               userChoice == SCISSORS && computerChoice == PAPER)
      {
         return "User wins";
      }
      else 
      {
         return "Computer Wins";
      }
}
}