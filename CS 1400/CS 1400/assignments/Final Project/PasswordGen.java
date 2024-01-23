import java.util.*;
import java.io.*;

public class PasswordGen
{
   //random number generator to generate random numbers for password
   Random gen = new Random();
   
   //variables
   String sentence = " ";
   String password = " ";
   String actualPassword;
   
   //arrays
   private String[] symbols = new String[]{"!", ",", "@", "$", "*", "?", ".", "/", "%", "]"};
   private ArrayList <String> locations = new ArrayList<>();
  
   private String filename = "Locations.txt";
   
   private Scanner fileIn;
   
   //constructor
   public PasswordGen()
   {
      try
      {
         fileIn = new Scanner(new FileReader(filename));
         
         while(fileIn.hasNext())
         {
            locations.add(fileIn.nextLine());
         }//end while
      }//end try
      //error message for file not found
      catch(FileNotFoundException e)
      {
         System.out.println("Error: " + e.getMessage());
      }//end flenotfound
      //catches other errors
      catch(Exception e)
      {
         System.out.println("Error: " + e.getMessage());
      }//end catch
      //close the file
      finally
      {
         fileIn.close();
      }//end finally
   }//end constructor
   
   //does everything to create password
   public String createPassword(String sentence)
   {
      sentence += this.sentence;
      /*I didn't want hte password to short or to long so 
      I made an if statement for if the sentece is less than 30 
      so it would take more letters from the sentence*/
      if(sentence.length() <= 30)
      {  
         for(int i = 0; i < sentence.length(); i+= 2)
         {
            if(password.length() < 30)
            {
            //pulls charcters from sentecne
            password += sentence.charAt(i);
            //this deosn't work so it is commented out
            /*if(i == 8)
            {
               sentence.substring(16).toUpperCase();
            }//edn if*/
            //gets a word from the file and adds a number
            if(i == 8)
            {
               password += locations.get(gen.nextInt(100) + 1);
               password += gen.nextInt(9);
            }//end if
            //adds a number. I wanted to ensure a number got in the password so I also put a number in the previous statement
            if(i == gen.nextInt(2)*2)
            {
               password += gen.nextInt(51) + 6 + "." + gen.nextInt(434) + 234;   
            }//end if
            //adds a special character
            if(i == 8)
            {
               password += symbols[gen.nextInt(10)];
            } //end  if 
            //doesn't add anything, just put an else statement for if none of the ifs are true
            else
            {
               password += "";
            }//end else
           }//end if password < 32
         }//emd for
      }//end if
      else if(sentence.length() > 30)
      {
         //this for loop makes it stop when it reaches the end of the sentence
         for(int j = 0; j < sentence.length(); j += 8)
         {
            //this if makes it so a password longer than 32 characters doesn't happen
            if(password.length() < 32)
            {
            password += sentence.charAt(j);
            //doesnt work so it is commented out
            /*if(j == 24)
            {
               sentence.substring(24).toUpperCase();
            }//end if*/
            //puts in a word and number
            if(j == 32)
            {
               password += locations.get(gen.nextInt(100) + 1);
               password += gen.nextInt(9);
            }//end if
            //adds a number sometimes but not everytime
            if(j == gen.nextInt(20) + 2)
            {
               password += gen.nextInt(51) + 6 + "." + gen.nextInt(434) + 234;   
            }//end if
            //adds symbols if j = the random number
            if(j == 32)
            {
               password += symbols[gen.nextInt(10)];
            }//end if
            else
            {
               password += "";
            }//end else
           }//end if(password < 32)
         }//end for      
      }//end if
        /* I figured out how to replace the spaces from the strings using
        this website
        https://www.geeksforgeeks.org/how-to-remove-all-white-spaces-from-a-string-in-java/   
        This website told me about the replaceAll method and it gave an example where spaces were removed.
        I changed what it used that way it would remove the spaces and I could be sure nothing else would be removed.
        */    
      password = password.replaceAll(" ", "");
      //allows other methods to access the password
      return password;
   }//end create password
   /*I made a seperate method to show the password because it wouldn't return
   to PasswordGenGUI from the method I created the password in*/
   public String showPassword()
   {
      //createPassword(password);
      return password;
   }//end showPassword

}//end class