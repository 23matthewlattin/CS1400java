import java.awt.*;
import javax.swing.*;

class MyWindow extends JPanel{
  private JFrame window = new JFrame("My First Window");
  public MyWindow(){
     //Ends the program when the window is closed
     window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     //Add custom layout to window
     window.add(this);
     window.setSize(800, 600);
     window.setVisible(true);  
  }
 
  //Overrides the paint method to add your own graphics
  public void paintComponent(Graphics g){
      g.setFont(new Font("Arial", Font.BOLD, 22));
      g.drawString("Shapes", 50, 50);
      g.setColor(Color.green);
      g.drawRect(100, 100, 100, 50);
      g.setColor(new Color(200, 100, 102));
      g.fillOval(20, 120, 240, 120);
      int diamondX [] = {500, 520, 500, 480};
   	int diamondY [] = {100, 120, 200, 120};
	   g.fillPolygon(diamondX, diamondY, diamondX.length);
      int a [] = {320, 440, 520,420, 300};
      int b [] = {180, 200, 320, 380, 340};
      g.fillPolygon(a, b, a.length);
      g.drawArc(500, 500, 200, 50, 300, 300);
      g.fillArc(200, 300, 245, 147, 90, 90);
      g.fillRoundRect(200, 400, 55, 87, 300, 50);
      g.drawLine(50,50, 300, 400);

  }
 
  public static void main(String args[]){
     new MyWindow();
  }
}
