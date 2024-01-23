import java.util.*;
import java.io.*;

 class PasswordChecker{
   private ArrayList<String> Usernames = new ArrayList<>();
   private ArrayList<String> Passwords = new ArrayList<>();
   
   private String filename = "LoginInfo.txt";
   private Scanner fileIn;
   
   //constructor
   public PasswordChecker(){
      try{
         //use scanner to read file 
         fileIn = new Scanner(new FileReader(filename));
         //keep reading while there are items in the file
         while(fileIn.hasNext()){
            Usernames.add(fileIn.nextLine());
            Passwords.add(fileIn.nextLine());
         }//end while
      }//end try
      //display error message if file isnt found
      catch(FileNotFoundException e){
         System.out.println("Error: " + e.getMessage());
      }//end filenotfound
    
      //if any other error occurs display the message
      catch(Exception e){
         System.out.println("Error: " + e.getMessage());
      }
      //close the file regardless if there was an error or not
      finally{
         fileIn.close();
      }//end finally
   }//end constructor
   
   
   String checkPassword(String username, String password){
      for(int i = 0; i < Usernames.size() * 2; i ++){
         if(Usernames.get(i).equalsIgnoreCase(username)){
            if(Passwords.get(i).equals(password)){
               return "Password is Valid";
            }
         }
      }//end for
      return "Password invalid";
   }//end checkPassword
}