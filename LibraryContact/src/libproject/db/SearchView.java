package libproject.db;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class SearchView extends JFrame implements ActionListener {

	//SearchView SV = new SearchView(); 
	
	JTextField search;
	String data;
		
	   public SearchView() { 
		   
	        
		    Container c = this.getContentPane();
	        c.setLayout(null);

	        this.setBounds(10,10,700,500);
	        this.setTitle("Library Contacts Management System");

	        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	        JPanel panel = new JPanel();
	        panel.setBounds(0,0,700,500);
	        panel.setBackground(Color.gray);
	        panel.setLayout(null);
	        panel.setBackground(Color.LIGHT_GRAY);
	        c.add(panel);
	        Font f = new Font("Arial",Font.BOLD,25);
	        Font f1 = new Font("Arial",Font.BOLD,20);
	        JLabel lable = new JLabel();
	        lable.setBounds(130,10,400,100);
	        lable.setText("Enter the keyword for search");
	        lable.setFont(f);
	        panel.add(lable);
		    
	        search = new JTextField("",50);
	        search.setBounds(130,150,400,30);
	        search.setFont(f1);
	        panel.add(search);
	        
	        JButton button1 = new JButton("Search contacts");
	        //this.getContentPane().add(button1);
	        
	        button1.addActionListener(this);
	        button1.setBounds(130,300,400,30);
	        button1.setFont(f1);
	        
	        lable.setFont(f);
	        panel.add(button1);
	        
	        c.setVisible(true);
	        this.setVisible(true);
	        
	        
	   }
	   public void actionPerformed(ActionEvent event) {
		   
		   data=search.getText();
		   System.out.println(data);
		   
		   SearchData sd = new SearchData();
		   sd.cond=data;
		   sd.SearchData(data);
		   sd.setVisible(true);
		   System.out.println("Completed");
		   this.setVisible(false);
	   }
	
}
