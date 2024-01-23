import java.util.Scanner;

public class nameGame{

   public static void main(String []args)
   {
      Scanner scan = new Scanner(System.in);
      String name, lastName, subname, startName, street, town, subtown;
      
      System.out.println("Enter in your last name: ");
      lastName = scan.nextLine();
      subname = lastName.substring(0, 3);
      
      System.out.println("Enter in your first name");
      name = scan.nextLine();
      startName = name.substring(0, 2);
      
      System.out.println("Enter the street you live on");
      street = scan.nextLine();
      street = street.substring(0,2);
      
      System.out.println("Enter your birth town");
      town = scan.nextLine();      
      subtown = town.substring(0, 3);
      System.out.println(subname + startName);
      System.out.println(street + subtown);
   }//end main

}//end class

