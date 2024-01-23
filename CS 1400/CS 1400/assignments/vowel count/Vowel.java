class Vowel
{
     //private variables
    private int count;
    private String sentence;
   public Vowel(String sentence)
   {
     this.sentence = sentence; 
     count = 0;  
   }
   
   
  public boolean isVowel(char c)
   {
         if(c == 'a' ||c == 'e' || c == 'i'|| c == 'o' || c == 'u')
         {
            count ++;
            return true;
         }
         else
         {
            return false;
         }
      
   }//end isVowel
   
       public int getCount()
      {
        return count; 
      }
   
}//end class