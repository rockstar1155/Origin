import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
//Step 11 : Implementing ActionListener
class frameDemo extends JFrame implements ActionListener{      
 Container c; 
 
 JLabel uLabel=new JLabel("User Name");   
 JLabel pLabel =new JLabel("Password");     
 
 JTextField uname=new JTextField();  
 JPasswordField pass=new JPasswordField();  
 
 JButton loginbtn=new JButton("Login");
 
 frameDemo()
 {
 c=this.getContentPane();   
 c.setLayout(null);    
 c.setBackground(Color.YELLOW);   
 
 uLabel.setBounds(100,50,100,40);     
 pLabel.setBounds(100,140,100,40); 
 
 uname.setBounds(250,50,200,40);
 pass.setBounds(250,140,200,40); 
 
 loginbtn.setBounds(280,250,140,50); 
 loginbtn.addActionListener(this);      
 
 Font f=new Font("Arial", Font.BOLD,18);  
 uLabel.setFont(f);
 pLabel.setFont(f);
 
 uname.setFont(f);
 pass.setFont(f); 
 
 loginbtn.setFont(f);
 
 // Step 15 : adding hand cursor on button
 Cursor cur=new Cursor(Cursor.HAND_CURSOR);
 loginbtn.setCursor(cur);   //applying cursor to the button
 
 c.add(uLabel);
 c.add(pLabel);
 
 c.add(uname);
 c.add(pass);
 
 c.add(loginbtn);       
 } 
 
 public void actionPerformed(ActionEvent e){
 //Step 14 : performing login action
 if(e.getSource()==loginbtn)
 {
 String username=uname.getText();    
 String password=pass.getText();       
 if(username.equals("umesh") && password.equals("1234"))       
 {
 JLabel success=new JLabel("Login Success");          
 success.setBounds(280,300,140,50);
 c.add(success);
 }
 else
 {
 JLabel msg=new JLabel("Invalid User Name or Password");       
 msg.setBounds(280,300,400,50);                        
 c.add(msg);
 } 
 } 
 } 
}
 
public class myLoginForm{
 public static void main(String args[]){
 
 frameDemo frame=new frameDemo();   
 frame.setVisible(true);
 frame.setTitle("Login Form Example");
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setBounds(100,100,700,500); 
 }
}