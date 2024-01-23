import java.util.*;
  
  public class GuessNumber{
   public static void main (String args [])
   {
      
      // Instantiate random number and scanner
      Random random = new Random();
      Scanner keyboard= new Scanner(System.in);
      
      int compNum;
      int userNum;
      int guessNum =0;
      
      compNum = random.nextInt(100) + 1;
      do
      {
      System.out.println("Guess a number");
      userNum = keyboard.nextInt();
      guessNum ++;
         if (userNum > compNum)
         {
            System.out.println("Too high");
         }
         else if(userNum < compNum)
         {
            System.out.println("Too low");
         }
         else if (userNum == compNum)
         {
            System.out.println("Correct");
            System.out.println("That took " +guessNum + " guesses.");
         }
      } while(userNum != compNum);
   }
  }
 