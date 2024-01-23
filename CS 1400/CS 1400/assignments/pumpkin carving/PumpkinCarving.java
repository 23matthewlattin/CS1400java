import java.awt.*;
import javax.swing.*;


class PumpkinCarving extends JPanel{
  private JFrame window = new JFrame("My First Window");
  public PumpkinCarving(){
     //Ends the program when the window is closed
     window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     //Add custom layout to window
     window.add(this);
     window.setSize(810, 700);
     window.setVisible(true); 
     window.setBackground(Color.black); 
  }
  
 
  //Overrides the paint method to add your own graphics
  public void paintComponent(Graphics g){  
      g.setColor(new Color(255, 90, 0));
      g.fillOval(0, 0, 800, 700);
      g.setColor(Color.black);
      
      g.fillArc(125, 100, 600, 550, 180, 180);
      g.fillOval(100,100, 200, 250);
      g.fillOval(325, 200, 100, 100);
      g.fillOval(450, 100, 200, 250);
      g.setColor(Color.blue);
      g.drawOval(425, 90, 240, 270);
      g.drawOval(90, 90, 240, 270);
      g.fillRect(329, 200, 102, 2);
      g.fillRect(70,150, 40,2);
      g.fillRect(645, 150, 86, 2);
      g.setColor(new Color(255, 90, 0));
      g.fillArc(150, 360, 100, 150, 50, 75);
      g.fillArc(300, 360, 100, 150, 50, 75);
      g.fillArc(450, 360, 100, 150, 50, 75);
      g.fillArc(570, 360, 100, 150, 50, 75);
      g.fillRect(250, 560, 75, 80);
      g.fillRect(375, 560, 75, 100);
      g.fillRect(515, 560, 75, 80);
      
  }
 
  public static void main(String args[]){
     new PumpkinCarving();
     
  }
}
