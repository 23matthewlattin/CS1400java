//used for windoes components
import javax.swing.*;
//imports the events for the components
import java.awt.*;
import java.awt.event.*;


class BinaryConvertor extends JPanel
{
   //constructor to set up the window
   public BinaryConvertor()
   {
      
      BinaryNumber b = new BinaryNumber();
      
      //creates the window - the text is the title of the window
      JFrame window = new JFrame("Binary Number Convertor");
      //exit the program when the window closes - not the defualt instead just closes
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //windows components
      //declare components
      JLabel lblPrompt = new JLabel("Enter the number in Binary: " );
      JLabel lblDecimal = new JLabel("Decimal: 0");
      JTextField txtBinary = new JTextField("000000000");
      JButton btnToDecimal = new JButton("To Decimal");
      //set positions of components 
      //user interface should be organized with a flow
      lblPrompt.setBounds(40, 40, 200, 30);
      txtBinary.setBounds(250, 40, 100, 30);
      lblDecimal.setBounds(40, 80, 300, 30);
      btnToDecimal.setBounds(250, 120, 100, 30);
      //set layout to null allows us to set bounds and not use default layout
      setLayout(null);
      //add the components
      add(lblPrompt);
      add(txtBinary);
      add(lblDecimal);
      add(btnToDecimal);
      
      window.add(this);
      window.setSize(400, 200);
      window.setVisible(true);
      
      //event for button
      //listener that listens for something to happen
      btnToDecimal.addActionListener( new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            {
               //examples of what we can do on a button press
               //lblDecimal.setText("Hello");
               
               String str = txtBinary.getText();
               b.setBinary(str);
               
               lblDecimal.setText(b.toString());
               
            }//ends actionsPerformed
               
        }//ends actionlistener
            
      ); //ends the event\
              
  }//ends constructor
      
      public static void main(String args[])
      {
         //create a window
         BinaryConvertor c = new BinaryConvertor();
         //could also just instantiate object because c will never be used
         //new BinaryConvertor();
      }//end main
   }// end binary convertor