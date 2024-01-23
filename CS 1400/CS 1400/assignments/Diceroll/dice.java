import java.util.*;

public class dice{
   
   public static void main(String args[]){
      Scanner input = new Scanner(System.in);
      int numOfTimes;
      System.out.println("How many times do you want to roll the dice?");
      numOfTimes = input.nextInt();
      diceRolls DR = new diceRolls();
      DR.roll(numOfTimes);
  }
}