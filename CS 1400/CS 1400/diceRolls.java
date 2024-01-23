import java.util.*;

public class diceRolls{
   Random gen = new Random();
   Scanner input = new Scanner(System.in);
   
   private int [] rollCount = new int [11];
   private int die1, die2;
   private int numOfTimes;
   //overloaded constructor
   public diceRolls(int numberToRoll)
   {
      numOfTimes = numberToRoll;
   
   }
   public void roll(){
      die1 = gen.nextInt(6) + 1;
      die2 = gen.nextInt(6) + 1;
      System.out.println(die1 + die2);
   }//end roll
   public String toString(){    
      String str = " ";
      for(int j = 2; j <= numOfTimes + 2; j++){
         str += "j" + j + ":" + rollCount[j - 2] + "\n";
      }//end for     
      return str;
     }//end tosstring
   public void roll(int numOfTimes){
      for(int i = 0; i < numOfTimes; i ++){
         roll();
         rollCount[(die1 + die2) - 2] ++;              
     }//end for   
    }//end roll  
      
     
}