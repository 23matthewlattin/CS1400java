import java.util.*;
import javax.swing.*;
import java.awt.event.*;

 
class StudentGrades extends JPanel {
   private JFrame window = new JFrame("Student Grades");
   private JLabel lblName = new JLabel("Name: ");
   private JLabel lblScore = new JLabel("Score: ");
   private JLabel lblHigh = new JLabel("");
   private JLabel lblAvg = new JLabel("");
   private JTextField txtName = new JTextField("");
   private JTextField txtScore = new JTextField("");
   private JButton btnStudent = new JButton("Add Student");
   private JButton btnStats = new JButton("Show Stats");
   
   //create arraylist to store the students
   private ArrayList<Student>studentList = new ArrayList<Student>();
   
   public StudentGrades(){
      setLayout(null);
      //set positioning
      lblName.setBounds(10, 10, 150, 50);
      lblScore.setBounds(10, 80, 150, 50);
      lblHigh.setBounds(10, 200, 300, 50);
      lblAvg.setBounds(10, 250, 300, 50);
      txtName.setBounds(120, 10, 150, 50);
      txtScore.setBounds(120, 80, 150, 50);
      btnStudent.setBounds(150, 150, 150, 40);
      btnStats.setBounds(150, 300, 150, 40);
      
      
      
      //add components
      add(lblName);
      add(lblScore);
      add(lblHigh);
      add(lblAvg);
      add(txtName);
      add(txtScore);
      add(btnStudent);
      add(btnStats);
      
      //exit program when window closes
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      window.setSize(500, 400);
      window.add(this);
      window.setVisible(true);
      
      //event for btnStudent
      btnStudent.addActionListener(new ActionListener (){
         public void actionPerformed(ActionEvent e){
         //get name from txtName 
         String name = txtName.getText();  
         //get the score from txtScore
         int score = Integer.parseInt(txtScore.getText());  
         //create instance of student class
         Student s = new Student(name, score);  
         //add instance to arraylist
         studentList.add(s);      
         //clear out txtfields now that instance has been created
         txtName.setText("");
         txtScore.setText("");    
       }  
   });//end actionlistener
   
   //event for avg and high scores
   btnStats.addActionListener(new ActionListener (){
      public void actionPerformed(ActionEvent e){
         
         Student highScore = studentList.get(0);
         int high = highScore.getScore();
         //find the high score
         for(Student s: studentList){
            int score = s.getScore();
            if(score > high){
              high = score;
              highScore = s;
              
            }
         }
         lblHigh.setText("High Score: " + highScore.toString());
         
         //calculate the avg
         double sum = 0;
         int count = 0;
         double avg = 0;
         for(Student s: studentList){
            sum += s.getScore();
            count ++;
            avg = sum / count;
         }
         lblAvg.setText("Average: " + avg);
        }
      });//end actionlistener

}//end consructor
   public static void main(String args[]){
      //scanner
     new StudentGrades();
      
      
   }//end main
}//end class