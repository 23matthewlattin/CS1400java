import java.util.*;

class Student {
   //variables
   private String name;
   private int score;
   
   public Student(String name, int score){
      this.name = name;
      this.score = score;
   }
   
   public int getScore(){
      return score;
   }
   public String toString(){
      
      return name + ":" + score;
   }
}//end class