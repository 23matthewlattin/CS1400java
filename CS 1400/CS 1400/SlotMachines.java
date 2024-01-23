 
 import java.util.*;
  
  public class SlotMachines{
   public static void main (String args []) 
   {
   
      // Instantiate random number and scanner
      Random generator = new Random();
      Scanner keyboard= new Scanner(System.in);
      
      //Declare variables
      int input;
      int iTokens = 100;
      int iSlot1, iSlot2, iSlot3;
      
      do
      {
         //Print lines to set game
         System.out.println("Slot Machine");
         System.out.println("Token" + iTokens);
         System.out.println("Press 1 to pull, 2 to quit");
         
         input = keyboard.nextInt();
         
         if(input == 1)
         {
            // set variables to number from 1 to 3
            iSlot1 = generator.nextInt(20) + 1;
            iSlot2 = generator.nextInt(20) + 1;
            iSlot3 = generator.nextInt(20) + 1;
            // output what variables were set to
            System.out.println(iSlot1 + " " + iSlot2 + " "  + iSlot3);
         
            
            if(iSlot1 == iSlot2 && iSlot1 == iSlot3)
            {
               System.out.println("You win 10 tokens");
               iTokens += 10;
            }
            else if (iSlot1 == iSlot2 || iSlot1 == iSlot3  || iSlot2 == iSlot3)
            {
               System.out.println("You win 5 tokens");
               iTokens += 5; 
            }
            else
            {
               System.out.println("You lose a token");
               iTokens -= 1;
            }
          }
          
       }while((iTokens > 0) && (input != 2));
   }
}