import java.util.Scanner;
class MethodPractice{
 /*  Step 1: Write a user-defined method that will determine if a number is even or not.*/
   static boolean  isEven ( int num){
   return num % 2 == 0;
}
   int num;
  public static void main(String []args){
     Scanner in = new Scanner(System.in);
     System.out.println("Enter a number"); 
     int num = in.nextInt();
     /* Step 2: Change the condition on the if statement from true, to a function call your user-defined method*/
     if( isEven (num)){
        System.out.println(num + " is an Even Number");
     }
     else{
        System.out.println(num + " is not an Even Number");
     }
  } 
}//End MethodPractice class
