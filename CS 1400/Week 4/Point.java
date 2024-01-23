public class Point{
   private int x, y;
   //constructor
   public Point(){
      x = 0;
      y = 0;
   }
   //overloaded constructor
   public Point(int x, int y){
      this.x = x;
      this.y = y;
   }
   
   public void setX(int x){
	this.x = x;
   }
   
   public void setY(int y){
	this.y = y;
   }
   //action
   public int getX(){
      return x;
   }
   // action
   public double distanceTo(Point p){
      double distance;
      distance = Math.sqrt(Math.pow(y-p.getY(), 2)
+ Math.pow (x-p.getX(), 2)  );
      return distance;
   }
   //action
   public String toString(){
      return "[" + x + ", " + y + "]";
   }
   //mutator
   public void setPoints(int newX, int newY){
      x = newX;
      y = newY;
   }
   //accessor
   public int getY()
   {
      return y;
   }
}
