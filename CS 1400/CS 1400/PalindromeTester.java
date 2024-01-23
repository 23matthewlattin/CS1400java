import java.util.Scanner;

public class PalindromeTester
{
   public static void main (String[] args)
   {
   

      String sentence = "";
      System.out.println("Palindrome Tester");
      //declare and instantiate scanner
      Scanner in = new Scanner(System.in);
      System.out.println("What would you like me to test?");
      sentence = in.nextLine();
      
      //declare and instantiate Palindrome 
      Palindrome tester = new Palindrome(sentence);
      
      //test clean
      System.out.println(tester.getClean());
      
      if(tester.isPalindrome())
      {
         System.out.println(tester + " is a palindrome");
      }
      else
      {
         System.out.println(tester + " is not a palindrome");
      }
      
      String meal = new  String( "Breakfast" );
String dinner = meal;
if (meal == "Breakfast"){
    System.out.println("First");
}
if(dinner.equals("Breakfast")){
    System.out.println("Second");
}
if(meal == dinner){
    System.out.println("Third");
}
   }//end main
}//end class