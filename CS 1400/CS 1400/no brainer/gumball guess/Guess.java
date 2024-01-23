class Guess
{
   //instance variables
   private String name;
   private int guess;
   
   //overoaded constructor
   public Guess (String name, int guess)
   {
      this.name = name;
      this.guess = guess;
   }
   
   //getter for the guess
   public int getGuess()
   {
      return guess;
   }
   
   //toString for the display
   public String toString()
   {
      return name + ": " + guess;
      
   }
   
}