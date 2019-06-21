package libproject.db;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class LoginPage extends JFrame implements ActionListener {
	
		JPanel panel;
		JLabel lable;
		JTextField login;
		JPasswordField pass;


	    public LoginPage() {
	        
	        Container c = this.getContentPane();
	        c.setLayout(null);

	        this.setBounds(10,10,700,500);
	        this.setTitle("Library Contact Management System");

	        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	        panel = new JPanel();
	        panel.setBounds(0,0,700,500);
	        panel.setBackground(Color.LIGHT_GRAY);
	        panel.setLayout(null);
	        c.add(panel);
	        Font f = new Font("Arial",Font.BOLD,25);
	        Font f1 = new Font("Arial",Font.BOLD,20);
	        lable = new JLabel();
	        lable.setBounds(130,10,400,100);
	        lable.setText("Library Contact Management");
	        lable.setFont(f);
	        panel.add(lable);
	        login = new JTextField("Username",10);
	        login.setBounds(120,150,400,30);
	        login.setFont(f1);
	        panel.add(login);
	        
	        pass =new JPasswordField("Password");
	        pass.setBounds(120,200,400,30);
	        pass.setFont(f1);
	        
	        
	        JButton button1 = new JButton("Login");
	        //this.getContentPane().add(button1);
	        
	        button1.addActionListener(this);
	        
	        
	        button1.setBounds(120,300,400,30);
	        button1.setFont(f1);
	        
	        lable.setFont(f);
	        panel.add(pass);
	        panel.add(button1);
	        
	        c.setVisible(true);
	        this.setVisible(true);
	        

	        }
	    
	        public void actionPerformed(ActionEvent event) {
//	        	try {
//	        		
	        		String usr=login.getText();
	        		//@SuppressWarnings("deprecation")
					String pwd=pass.getText();
	        		if (usr.equalsIgnoreCase("Admin") && pwd.equals("admin")) {
	        		System.out.println("Valid credentials");
	        		this.dispose();
	        		Welcome w = new Welcome();
	        		w.setVisible(true);
	        		//this.setVisible(false);
	        		
	        		}
	        		   else{
	        			   System.out.println("enter the valid username and password");
	        			   JOptionPane.showMessageDialog(this,"Incorrect login or password",
	        			   "Error",JOptionPane.ERROR_MESSAGE);
	        			   }
//	        	 } catch (Exception e) {
//	        		e.printStackTrace();
//	        	}
	        }


}
