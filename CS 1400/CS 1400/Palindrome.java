class Palindrome
{
   private String sentence;
   
   //palindrome example a man, a plan, a canal, Panama
   // check for space and anuthing not a letter
   // first get a clean string amanaplanacanalpanama
   // use for loop to do this
   
   //overloaded constructor
   public Palindrome(String sentence)
   {
      //set default sentence
      this.sentence = sentence;
   }
   
   // do our action
   public String getClean()
   {
      String clean = " ";
      //we dont want to change sentence so we will create a temporay 
      String tempSentence = sentence.toLowerCase();
      //taco, cat
      //start at character 0 and go through each character in string
      //we know the length of the string so we can use a for loop
      for(int i = 0; i < tempSentence.length(); i++)
      {
         //could use charAt or substring to isolate a single character
         //charAt has a return type of char
         //substring has a return type of strign
         
         //use 1 to get each letter in the string
         char letter = tempSentence.charAt(i);
         
         /*
         if(letter >= 'a' && letter <= 'z')
         {
            clean += letter;
         }
         */
         
         if(Character.isLetter(letter))
         {
            clean += letter;
         }
         
      }//end for
      
      return clean;
      
   }//end getClean
   
   public String reverse()
   {
      String clean = getClean();
      String backwards = "";
      
      //pretend we have word cat 012 are the positions so start at length - 1
      //so 3 - 1
      for(int i = clean.length()-1; i >= 0; i --)
      {
         //could use charAt or substring
         backwards += clean.charAt(1);
         
         //backwards += substring(i, i+1);
      }//end for
      
      return backwards;
   }//end reverse
   
   public boolean isPalindrome()
   {
      //call getClean and store it in variable clean
      String clean = getClean();
      //call reverse and store it varaible backwards
      String backwards = reverse();
      
      //can i use == NO
      if(backwards.equals(clean))
      {
         return true;
      }//end if
      
      //default
      return false;
      
   }//end isPalindrome
   
   public String toString()
   {
      return sentence;
   }
}//end class