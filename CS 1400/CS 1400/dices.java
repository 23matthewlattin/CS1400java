import java.util.*;

public class dices{
   
   public static void main(String args[]){
      Scanner input = new Scanner(System.in);
      int numOfTimes;
      System.out.println("How many times do you want to roll the dice?");
      numOfTimes = input.nextInt();
      diceRollss DR = new diceRollss();
      DR.roll(numOfTimes);
      System.out.println(DR.toString());
  }
}