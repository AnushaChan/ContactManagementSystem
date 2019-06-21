package libproject.db;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Welcome extends JFrame implements ActionListener{

	
	JPanel panel;
	JLabel lable;


    public Welcome() {
        
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
        lable.setBounds(120,100,400,20);
        lable.setText("Library Contact Management");
        lable.setFont(f);
        panel.add(lable);
        
        
        JButton button1 = new JButton("Click here to add new member");
        //this.getContentPane().add(button1);
        
        button1.addActionListener(this);
        
        button1.setBounds(120,200,400,30);
        button1.setFont(f1);
        
        lable.setFont(f);
        panel.add(button1);
        
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
        		AddMember add = new AddMember();
        		add.setVisible(true);
        		//this.setVisible(false);
        		
            }
         });
        
        JButton button2 = new JButton("Click here to search contact");
        //this.getContentPane().add(button1);
        
        button2.addActionListener(this);
        
        button2.setBounds(120,300,400,30);
        button2.setFont(f1);
        
        panel.add(button2);
        
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
        		SearchView sv = new SearchView();
        		sv.setVisible(true);
        		
        		
            }
         });
        
        JButton button3 = new JButton("Quit");
        //this.getContentPane().add(button1);
        
        button3.addActionListener(this);
        
        button3.setBounds(120,400,400,30);
        button3.setFont(f1);
        
        panel.add(button3);
        
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
            	
        		wdispose();
        		
            }
         });
        
        c.setVisible(true);
        this.setVisible(true);
        

        }
    
        public void actionPerformed(ActionEvent event) {


        }
        
        public void wdispose() {

        		this.dispose();

        }
	
}
