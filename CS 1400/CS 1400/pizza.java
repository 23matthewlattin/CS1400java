import java.util.Scanner;
public class pizza{
   public static void main(String arg[]){
   Scanner input = new Scanner(System.in);
   System.out.println("Pineapple pizza tastes good. True or false: ")  ;
   String time = input.nextLine();
   System.out.println(time);
   if(time.equals("true")) {
   System.out.println("You are a winner");
   } else if(time.equals("false"))
   {
   System.out.println("you suck!");
   }else
   {
   System.out.println("Incorrect input");
   }
   
   }
   }