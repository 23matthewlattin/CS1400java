/* using object oriented programming we will create the pig dice game.
matthew lattin
Cs 1400
*/

//saved in same folder so it can find 
// pig player

import java.util.Scanner;

class PigGame
{
   // this is our driver class so we will create main in here
   public static void main (String[] args) 
   {
      Scanner input = new Scanner(System.in);
      
      System.out.println("Pig Game");
      String name;
      
      //does 2 things 1 declares the object (creates) 2 instantiates object
      // in this case the default constructor is called because
      // there are no parmeters in the ()
      PigPlayer player1 = new PigPlayer();
      //just declares doenst instantiate it
      PigPlayer player2;
      
      //set the player1 name using the setter
      System.out.println ("Player1 enter your name");
      name = input.nextLine();
      player1.setName(name);
      
      //cannot use setter for player 2 becuase it hasnt been instantiated
      System.out.println("Player2 enter in your name: " );
      name = input.nextLine();
      //instantiate object
      /* example of how to use overloaded constructor - will look for constructor with one
      string parameter*/
      player2 = new PigPlayer(name);
      
      //play the game
      //create loop that runs untill someone wins
      do
      {
         playerMove(player1);
         //check to make sure player 1 didn't win already
         if(player1.getScore() > 50)
            break;
         playerMove(player2);   
      }while(player1.getScore() < 50 && player2.getScore() < 50);
    }//end main
    
    //user defined method, code repeated by both players
    //take a player and have them roll as many times as they want
    //call same code for two different objects
    public static void playerMove(PigPlayer player)
    {
      //local variable cannot see scanner from main, could pass it or not
      Scanner in = new Scanner(System.in);
      String choice;
      
      do
      {
         System.out.println(player);
         System.out.println("(R)oll or (P)ass: ");
         choice = in.nextLine();
         //check to see if string is r
         if(choice.equalsIgnoreCase("r"))
         {
            //chose to roll so call from pigplayer class
            player.roll();
            //call the getter for die value
            System.out.println("Die value: " + player.getDieValue());  
         }//end if
         //continue to roll if they choose roll and roll != 1
     }while(choice.equalsIgnoreCase("r") && player.getDieValue() != 1);
     
     player.pass();
     r
    }//end player move
}//end class