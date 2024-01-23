/*Pig is played by rolling a dice or passing it to other player
Each roll gains points for that round. Rolling a 1 loses all points for that round.
If you pass you keep points for that round. When you pass other player can go.
 Get to 50 to win.
  */
  import java.util.Random;
  
  class PigPlayer{
  //dont need main because we are using multiple classes
  
  // class variables 
  //for every instance of class these variables are created
  // these all are private so the can only be seen by this class
  private int score;
  private int roundScore;
  private int die;
  private String name;
  
  /*random number variable is a special case. Share between all instances
  of the class because it will use the same random numbers for both instances so instead
  share it between two instances
  use static to makein independent of instance */
  private static Random gen = new Random();
  
  //Constructor allows you to have default values for class
  //this runs when you instantiate your class
  public PigPlayer()
  {
   name = "Player";
  }
  //this is an overloaded constructor
  //mayber you need to set values that are passed in
  // allows you to set default variables with parameters passed to it
  public PigPlayer(String playerName)
  {
      name= playerName;
  }
  
  //setter
  // allows us to set a private variable
  public void setName(String newName)
  {
      name = newName;
  }
  
  //getter
  //gives us read only access to score allows more control over private
  //variables in a class
  public int getScore()
  {
      return score;
  }
  
  //getter
  public int getDieValue()
  {
      return die;
  }
  
  //getter
  public int getRoundScore()
  {
      return roundScore;
  }
  
  //to string method allows us to display all info for this class
  //helps with debugin and can show what is going on in the class
  public String toString()
  {
      return name + ": Round Score: " + roundScore + " Score: " + score;
  }
  
  //now we create methods for the actions
  public void roll()
  {
      //simulate rolling the dice
      die = gen.nextInt(6) + 1;
      //if the die is 1 our round is set to 0 else it is added to round score
      if(die == 1)
      {
         roundScore = 0;
      }
      else
      {
         roundScore += die;
      }
     }
     
     public void pass()
     {
      //set overall score to roundscore and reset roundscore for next round
      score += roundScore;
      roundScore = 0;
     }
}// end class