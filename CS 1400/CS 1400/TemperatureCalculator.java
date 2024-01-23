import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class TemperatureCalculator extends JPanel{
 private JFrame window = new JFrame("Temperature Converter");
 public TemperatureCalculator(){
    //Ends the program when the window is closed
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //Declare other components
    JLabel lblFah = new JLabel("Fahrenheit");
    JLabel lblCel = new JLabel ("Celsius");
    JTextField txtFah = new JTextField("32");
    JTextField txtCel = new JTextField("0");
    JButton btnConvertFah = new JButton("Convert Celsius");
    JButton btnConvertCel = new JButton("Convert Celsius");
  
    //Sets positions of components (x, y, width, height)
    lblFah.setBounds(50, 50, 150, 40);
    txtFah.setBounds(200, 50, 150, 40);
    txtCel.setBounds(200, 100, 150, 40);
    btnConvertFah.setBounds(200, 150, 150, 40);
    lblCel.setBounds(50, 100, 150, 40);
    btnConvertCel.setBounds(50, 150, 150, 40);
      
    //Adds components. 
    setLayout(null);
    add(lblFah);
    add(txtFah);
    add(txtCel);
    add(btnConvertFah);
    add(lblCel);
    add(btnConvertCel);
    //Add custom layout to window
    window.add(this);
    window.setSize(400, 300);
    window.setVisible(true);
 
    //btnConvertFah Event
    btnConvertFah.addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent e){
            double fahrenheit = Double.parseDouble(txtFah.getText());
            double celsius = (fahrenheit - 32) * 5 / 9.0;
            txtCel.setText(Double.toString(celsius));
       }//End actionPerformed
    });//End AddActionListener
    btnConvertCel.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
         double celsius = Double.parseDouble(txtCel.getText());
         double fahrenheit = (celsius * 1.8) + 32;
         txtFah.setText(Double.toString(fahrenheit));
      }//end action performed
    }); //end action listener
 }
 public static void main(String args[]){
    new TemperatureCalculator();
 }
}
