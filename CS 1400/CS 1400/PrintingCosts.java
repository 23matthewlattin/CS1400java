import java.util.Scanner;
class PrintingCosts{
   public static void main(String args[])
   { 
      Scanner input = new Scanner(System.in);
      
      int numCopies;
      double cost;
      double pricePerCopy;
      
      do
      {
         System.out.println("Enter a number of copies (-1 to quit):" );
         numCopies = input.nextInt();
         
         if(numCopies < 0)
         {
            break;
         }
            else if(numCopies > 0 && numCopies <= 99)
         {
            pricePerCopy = .30;
         }
          else if(numCopies > 99 && numCopies <= 499)
         {
            pricePerCopy = .28;
         }
          else if(numCopies > 499 && numCopies <= 999)
         {
            pricePerCopy = .27;
         }
         else 
         {
            pricePerCopy = .25;
         }

         cost = pricePerCopy * numCopies;
         
         System.out.println("Your price per copy is: " + pricePerCopy);
         System.out.println("Your total cost is: " + cost);

      }while (numCopies> 0);    
     
   }
}
