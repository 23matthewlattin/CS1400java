import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class PasswordCheckerGUI extends JPanel{
      //add components to the windows
      private JFrame window = new JFrame("Login");
      private JLabel lblUser = new JLabel("Username: ");
      private JLabel lblPasswrd = new JLabel("Password: ");
      private JTextField txtUser = new JTextField();
      private JTextField  txtPasswords = new JTextField();
      private JButton btnLogin = new JButton("Sign In");
      private JLabel lblLogin = new JLabel("");
      private JTextField txtLogin = new JTextField("");
      
      //create instance of class
      private PasswordChecker passCheck = new PasswordChecker();
      //contstructor to set up window
      public PasswordCheckerGUI(){
         setLayout(null);
         
         //setbounds
         lblUser.setBounds(100, 100, 100, 50);
         lblPasswrd.setBounds(100, 200, 100, 50);
         txtUser.setBounds(200, 100, 100, 50);
         txtPasswords.setBounds(200, 200, 100, 50);
         btnLogin.setBounds(200, 300, 100, 50);
         lblLogin.setBounds(100, 400, 100, 50);
         txtLogin.setBounds(100, 350, 100, 50);
         
         //add to the window
         add(lblUser);
         add(lblPasswrd);
         add(txtUser);
         add(txtPasswords);
         add(btnLogin);
         add(lblLogin);
         add(txtLogin);
         
         //add panel to window
         window.add(this);
         //close program when window closes
         window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         window.setSize(400, 500);
         window.setVisible(true);
         
         //event for btnLogin\
         btnLogin.addActionListener(new ActionListener(){
               public void actionPerformed(ActionEvent e){
               String username = txtUser.getText();
               String password = txtPasswords.getText();
               txtLogin.setText(passCheck.checkPassword(username, password));
               txtUser.setText("");
               txtPasswords.setText("");
            }
         });
      }
      
   public static void main(String args []){
      new PasswordCheckerGUI();
   }
}