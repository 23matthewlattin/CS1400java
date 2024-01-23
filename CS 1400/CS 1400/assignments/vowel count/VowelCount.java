import java.util.Scanner;

class VowelCount
{
   public static void main(String[] args)
   {
      //variables
      String s;
      char c;
       
     //scanner
      Scanner input = new Scanner(System.in);
      
      System.out.println("Write a sentence");
      s = input.nextLine();
      //makes it so the sentence is all lower case so it can count the vowels properly
      String sentence = s.toLowerCase();
      
      //instantiate class
      Vowel vowel = new Vowel(sentence);
      
      //checks if each character is a vowel or not
      for(int i =0; i < sentence.length(); i ++)
      {
         //c is becoming the character in the sentence that has an index equal to i
         c = sentence.charAt(i);
         //calls isVowel method where it checks if a character is a vowel. It checks if c is a vowel or not
         vowel.isVowel(c);
              
      }
      
      System.out.println("Number of vowels is: " + vowel.getCount());     

   }//end main
}//end class