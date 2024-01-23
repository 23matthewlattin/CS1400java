import java.awt.*;
import javax.swing.*;

class PumpkinCarvingContest extends JPanel{
  private JFrame window = new JFrame("My First Window");
  public PumpkinCarvingContest(){
     //Ends the program when the window is closed
     window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     //Add custom layout to window
     window.add(this);
     window.setSize(810, 700);
     window.setVisible(true);  
  }
 
  //Overrides the paint method to add your own graphics
  public void paintComponent(Graphics g){  
      g.setColor(new Color(255, 90, 0));
      g.fillOval(0, 0, 800, 700);
      g.setColor(Color.black);
      g.fillOval(200, 200, 100, 75);
      int x [] = {634, 600, 667, 660, 545, 578};
      int y [] = {147, 177, 183, 150, 262, 123};
      g.fillPolygon(x, y, x.length);
      int a [] = {130, 150, 200, 380};
      int b [] = {129, 130, 100, 200};
      g.fillPolygon(a, b, a.length);
      g.fillRect(300, 300, 100, 50);
      g.fillOval(500, 200, 75, 150);
      g.fillArc(100,200,600,384, 200,147);
      g.setColor(new Color(255, 90, 0));
      g.fillRect(300, 500, 50, 100);
      g.fillRect(500, 500, 50, 100);
      g.fillRect(100, 250, 500, 5);
      int c [] = {350, 360, 350, 360};
      int d [] = {300, 350, 410, 420};
      g.fillPolygon(c, d, c.length);
      g.fillRect(425, 00, 25, 700);


  }
 
  public static void main(String args[]){
     new PumpkinCarvingContest();
     
  }
}
