class PointDriver{
	public static void main(String []args){
      double distance;
    
      Point p1 = new Point();
      Point p2 = new Point(5, 3);
      
      p1.setX(2);
      p1.setY(1);
      
      distance = p1.distanceTo(p2);
      
      System.out.println(p1.getX());
      System.out.println(p2.getY());
      System.out.println(distance);
	}
}
