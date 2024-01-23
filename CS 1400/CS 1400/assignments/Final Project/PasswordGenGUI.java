import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PasswordGenGUI extends JPanel
{
   //create instance of user defined class
   private PasswordGen passGen = new PasswordGen();
   
   private JFrame window = new JFrame("Create a Password: ");
   private JTextArea txtPasswrd = new JTextArea();
   private JLabel lblSentence = new JLabel("Enter a Sentence: ");
   private JLabel lblPassword = new JLabel("Your Password: ");
   private JTextField txtSentence = new JTextField("");
   private JTextField txtPassword = new JTextField("");
   private JButton btnGen = new JButton("Create the password");
   
   //constructor to set the window up
   public PasswordGenGUI()
   {
      setLayout(null);
      
      window.setSize(550, 550);
      lblSentence.setBounds(0, 0, 400, 100);
      lblPassword.setBounds(0, 300, 400, 100);
      txtSentence.setBounds(0, 100, 400, 100);
      txtPassword.setBounds(0, 400, 400, 100);
      btnGen.setBounds(0, 210, 400, 100);
      
      //add to window
      add(lblSentence);
      add(lblPassword);
      add(txtSentence);
      add(txtPassword);
      add(btnGen);
      
      window.add(this);
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      window.setVisible(true);
      
      //Button will put info entered into methods to create the password
      btnGen.addActionListener(new ActionListener (){
         public void actionPerformed(ActionEvent e)
         {   
            txtPassword.setText("");   
            String sentence = txtSentence.getText();
            passGen.createPassword(sentence);
            txtPassword.setText(passGen.showPassword());
         }  
      });
      
   }//end constructor
   public static void main(String args [])
   {
      new PasswordGenGUI();
   }
}