import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AboutMe extends JPanel{
   private JFrame window = new JFrame("About Me");
   public AboutMe(){
      //exit button will close the program 
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      //make components
      JButton btnAboutMe = new JButton("About Me");
      JButton btnHobbies = new JButton("Hobbies");
      JButton btnEducation = new JButton("Education");
      JButton btnJobs = new JButton("Jobs");
      JTextArea txtArea = new JTextArea("");
      
      //set window
      window.add(this);
      window.setSize(400, 400);
      window.setVisible(true);
      
      //add components
      setLayout(null);
      add(btnAboutMe);
      add(btnHobbies);
      add(btnEducation);
      add(btnJobs);
      add(txtArea);
      
      //set positions
      btnAboutMe.setBounds(50, 100, 100, 50);
      btnHobbies.setBounds(250, 100, 100, 50);
      btnEducation.setBounds(50, 250, 100, 50);
      btnJobs.setBounds(250, 250, 100, 50);
      txtArea.setBounds(0, 0, 400, 100);
     
      //add actions
      btnAboutMe.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
               txtArea.setText("I am 18 years old. I am attending Weber State.");   
            }
         });//end actionlistener
      
      
      btnHobbies.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
             txtArea.setText("I like to play video games and I like to read");     
            }
         });//end actionlistener
      
      
      btnEducation.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
               txtArea.setText("I graduated from high school and am in my first year of college");   
            }
         });//end actionlistener
     
      
      btnJobs.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
               txtArea.setLineWrap(true);
               txtArea.setText("I worked as a student custodian for 2 years at a junior high school." + 
               "My current job is a custodian at Weber State.");   
            }
         });//end actionlistener
   }//end constructor
   public static void main(String args[]){
      new AboutMe();
   }//end main
}//end class