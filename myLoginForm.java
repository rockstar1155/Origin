import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class frameDemo extends JFrame{
		
		Container c; 		
		
		JLabel uLabel=new JLabel("User Name");   
		JLabel pLabel =new JLabel("Password");     
		
		JTextField uname=new JTextField();  
		JPasswordField pass=new JPasswordField();  
		
		// Step 10 : Creating an object of JButton
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
				
				loginbtn.setBounds(280,250,140,50);    //setting location and size of JButton
				
				Font f=new Font("Arial", Font.BOLD,18);  
				uLabel.setFont(f);
				pLabel.setFont(f);

				uname.setFont(f);
				pass.setFont(f);				
	
				c.add(uLabel);
				c.add(pLabel);
				
				c.add(uname);
				c.add(pass);
				
				c.add(loginbtn);       //adding JButton to the container
				
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