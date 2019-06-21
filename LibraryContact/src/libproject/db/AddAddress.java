package libproject.db;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.lang.String.*;


public class AddAddress extends javax.swing.JFrame implements ActionListener{
	
		
	    private javax.swing.JLabel jLabel1;
	    private javax.swing.JLabel jLabel2;
	    private javax.swing.JLabel jLabel3;
	    private javax.swing.JLabel jLabel4;
	    private javax.swing.JLabel jLabel5;
	    private javax.swing.JLabel jLabel6;
	    private javax.swing.JLabel jLabel7;
	    private javax.swing.JLabel jLabel8;
	    private javax.swing.JLabel jLabel9;
	    private javax.swing.JLabel jLabel10;
	    private javax.swing.JLabel jLabel11;
	    private javax.swing.JLabel jLabel12;
	    private javax.swing.JLabel jLabel13;
	    private javax.swing.JLabel jLabel14;
	    private javax.swing.JLabel jLabel15;
	    private javax.swing.JLabel jLabel16;
	    private javax.swing.JLabel jLabel17;
	    private javax.swing.JLabel jLabel18;
	    private javax.swing.JLabel jLabel19;
	    private javax.swing.JLabel jLabel20;
	    private javax.swing.JLabel jLabel21;
	    private javax.swing.JLabel jLabel22;
	    private javax.swing.JLabel jLabel23;
	    public javax.swing.JTextField jT1;
	    public javax.swing.JTextField jT2;
	    public javax.swing.JTextField jT3;
	    public javax.swing.JTextField jT4;
	    public javax.swing.JTextField jT5;
	    public javax.swing.JTextField jT6;
	    public javax.swing.JTextField jT7;
	    public javax.swing.JTextField jT8;
	    public javax.swing.JTextField jT9;
	    public javax.swing.JTextField jT10;
	    public javax.swing.JTextField jT11;
	    public javax.swing.JTextField jT12;
	    public javax.swing.JTextField jT13;
	    public javax.swing.JTextField jT14;
	    public javax.swing.JTextField jT15;
	    public javax.swing.JTextField jT16;
	    public javax.swing.JTextField jT17;
	    public javax.swing.JTextField jT18;
	    public javax.swing.JTextField jT19;
	    public javax.swing.JTextField jT20;
	    public javax.swing.JTextField jT21;
	    public javax.swing.JTextField jT22;
	    public javax.swing.JTextField jT23;
	    public javax.swing.JTextField jT24;
	    public javax.swing.JTextField jT25;
	    public javax.swing.JButton jAddContact;
				
			   public AddAddress() { 
				   
			      
			        jLabel1 = new javax.swing.JLabel();
			        jLabel2 = new javax.swing.JLabel();
			        jLabel3 = new javax.swing.JLabel();
			        jLabel4 = new javax.swing.JLabel();
			        jLabel5 = new javax.swing.JLabel();
			        jLabel6 = new javax.swing.JLabel();
			        jLabel7 = new javax.swing.JLabel();
			        jLabel8 = new javax.swing.JLabel();
			        jLabel9 = new javax.swing.JLabel();
			        jLabel10 = new javax.swing.JLabel();
			        jLabel11 = new javax.swing.JLabel();
			        jLabel12 = new javax.swing.JLabel();
			        jLabel13 = new javax.swing.JLabel();
			        jLabel14 = new javax.swing.JLabel();
			        jLabel15 = new javax.swing.JLabel();
			        jLabel16 = new javax.swing.JLabel();
			        jLabel17 = new javax.swing.JLabel();
			        jLabel18 = new javax.swing.JLabel();
			        jLabel19 = new javax.swing.JLabel();
			        jLabel20 = new javax.swing.JLabel();
			        jLabel21 = new javax.swing.JLabel();
			        jLabel22 = new javax.swing.JLabel();
			        jLabel23 = new javax.swing.JLabel();
			        
			        jT1 = new javax.swing.JTextField();
			        jT2 = new javax.swing.JTextField();
			        jT3 = new javax.swing.JTextField();
			        jT4 = new javax.swing.JTextField();
			        jT5 = new javax.swing.JTextField();
			        jT6 = new javax.swing.JTextField();
			        jT7 = new javax.swing.JTextField();
			        jT8 = new javax.swing.JTextField();
			        jT9 = new javax.swing.JTextField();
			        jT10 = new javax.swing.JTextField();
			        jT11 = new javax.swing.JTextField();
			        jT12 = new javax.swing.JTextField();
			        jT13 = new javax.swing.JTextField();
			        jT14 = new javax.swing.JTextField();
			        jT15 = new javax.swing.JTextField();
			        jT16 = new javax.swing.JTextField();
			        jT17 = new javax.swing.JTextField();
			        jT18 = new javax.swing.JTextField();
			        jT19 = new javax.swing.JTextField();
			        jT20 = new javax.swing.JTextField();
			        jT21 = new javax.swing.JTextField();
			        jT22 = new javax.swing.JTextField();
			        jT23 = new javax.swing.JTextField();
			        jAddContact = new javax.swing.JButton();

			        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);


			        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
			        jLabel4.setText("Work Address");
			        
			        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
			        jLabel5.setText("Work City");
			        
			        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
			        jLabel6.setText("Work State");
			        
			        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
			        jLabel7.setText("Work Zip");
			        
			        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
			        jLabel8.setText("Home Address");
			        
			        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
			        jLabel9.setText("Home City");
			        
			        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
			        jLabel10.setText("Home State");
			        
			        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
			        jLabel11.setText("Home Zip");
			        
			        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
			        jLabel12.setText("Work Phone Area Code");
			        
			        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
			        jLabel13.setText("Work Phone Number");
			        
			        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
			        jLabel14.setText("Home Phone Area Code");
			        
			        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
			        jLabel15.setText("Home Phone Number");
			        
			        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
			        jLabel16.setText("Cell Phone Area Code");
			        
			        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
			        jLabel17.setText("Cell Phone Number");
			        

			        jT1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

			        jT2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

			        jT3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

			        jT4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
			        
			        jT5.setFont(new java.awt.Font("Tahoma", 0, 14));
			        jT6.setFont(new java.awt.Font("Tahoma", 0, 14));
			        jT7.setFont(new java.awt.Font("Tahoma", 0, 14));
			        jT8.setFont(new java.awt.Font("Tahoma", 0, 14));
			        jT9.setFont(new java.awt.Font("Tahoma", 0, 14));
			        jT10.setFont(new java.awt.Font("Tahoma", 0, 14));
			        jT11.setFont(new java.awt.Font("Tahoma", 0, 14));
			        jT12.setFont(new java.awt.Font("Tahoma", 0, 14));
			        jT13.setFont(new java.awt.Font("Tahoma", 0, 14));
			        jT14.setFont(new java.awt.Font("Tahoma", 0, 14));
			        jT15.setFont(new java.awt.Font("Tahoma", 0, 14));
			        jT16.setFont(new java.awt.Font("Tahoma", 0, 14));
			        jT17.setFont(new java.awt.Font("Tahoma", 0, 14));
			        jT18.setFont(new java.awt.Font("Tahoma", 0, 14));
			        jT19.setFont(new java.awt.Font("Tahoma", 0, 14));
			        jT20.setFont(new java.awt.Font("Tahoma", 0, 14));
			        jT21.setFont(new java.awt.Font("Tahoma", 0, 14));
			        jT22.setFont(new java.awt.Font("Tahoma", 0, 14));
			        jT23.setFont(new java.awt.Font("Tahoma", 0, 14));
			        
			        //jT18.setText("1900-01-01");
			        //jT19.setText("1900-01-01");
			        
			        jAddContact.setFont(new java.awt.Font("Tahoma", 0, 14));
			        jAddContact.setText("Add Address");
			        jAddContact.addActionListener(this);

			        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
			        getContentPane().setLayout(layout);
			        layout.setHorizontalGroup(
			            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			            .addGroup(layout.createSequentialGroup()
			                //.addGap(47, 47, 47)
			                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)			  
			                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
			                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
			                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
			                	.addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
			                	.addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
			                	.addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
			                	.addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
			                	.addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
			                	.addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
			                	.addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
			                	.addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
			                	.addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
			                	.addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
			                	.addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
			                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
			                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			                    .addComponent(jT4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
			                    .addComponent(jT5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
			                    .addComponent(jT6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
			                    .addComponent(jT7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
			                    .addComponent(jT8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
			                    .addComponent(jT9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
			                    .addComponent(jT10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
			                    .addComponent(jT11, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
			                    .addComponent(jT12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
			                    .addComponent(jT13, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
			                    .addComponent(jT14, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
			                    .addComponent(jT15, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
			                    .addComponent(jT16, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
			                    .addComponent(jT17, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
			                    .addComponent(jAddContact))  
			                .addContainerGap(116, Short.MAX_VALUE))
			        );
			        layout.setVerticalGroup(
			            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			            .addGroup(layout.createSequentialGroup()
			                //.addGap(26, 26, 26)
			                
			                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
			                    .addComponent(jLabel4)
			                    .addComponent(jT4, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
			                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
				                    .addComponent(jLabel5)
				                    .addComponent(jT5, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
			                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
				                    .addComponent(jLabel6)
				                    .addComponent(jT6, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
			                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
				                    .addComponent(jLabel7)
				                    .addComponent(jT7, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
			                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
				                    .addComponent(jLabel8)
				                    .addComponent(jT8, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
			                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
				                    .addComponent(jLabel9)
				                    .addComponent(jT9, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
			                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
				                    .addComponent(jLabel10)
				                    .addComponent(jT10, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
			                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
				                    .addComponent(jLabel11)
				                    .addComponent(jT11, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
			                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
				                    .addComponent(jLabel12)
				                    .addComponent(jT12, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
			                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
				                    .addComponent(jLabel13)
				                    .addComponent(jT13, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
			                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
				                    .addComponent(jLabel14)
				                    .addComponent(jT14, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
			                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
				                    .addComponent(jLabel15)
				                    .addComponent(jT15, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
			                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
				                    .addComponent(jLabel16)
				                    .addComponent(jT16, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
			                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
				                    .addComponent(jLabel17)
				                    .addComponent(jT17, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
			               
			                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
			                        .addComponent(jAddContact))
			                .addGap(48, 48, 48))
			        );

			        pack();
			        
//			        c.setVisible(true);
//			        this.setVisible(true);
			        
			        
			   }
			   public void actionPerformed(ActionEvent event) {
				   //LoginPage g = new LoginPage();
				   Connection conn = null;
			 	   Statement stmt = null;
			 	   ResultSet rs;
				   
				   
				   try{
					      
					      Class.forName("com.mysql.jdbc.Driver");

					      System.out.println("Connecting to database...");
					      conn = DriverManager.getConnection("jdbc:mysql://localhost/library?autoReconnect=true&useSSL=false","root","");
					      
					      stmt=conn.createStatement();
					      

						 
						 String key=jT18.getText();
						 
						  
						  System.out.println("Key:"+key);
						  
						  if (!jT4.getText().isEmpty()  || !jT5.getText().isEmpty() 
								  || !jT6.getText().isEmpty() || !jT7.getText().isEmpty()) {
						  
						  String sql1="insert into address (contact_id,address_type,address,city,state,zip) VALUES ("
						  				+key+
						  				", 'Work Address', '"+jT4.getText()+"','"+jT5.getText()+"','"
								  +jT6.getText()+"','"+jT7.getText()+"')";
							   System.out.println(sql1);
							   
						  PreparedStatement pstmt1 = conn.prepareStatement(sql1, Statement.RETURN_GENERATED_KEYS);
							   
						  Integer i1 = pstmt1.executeUpdate();
						  System.out.println(i1);
						  
						  }
						  //Home address
						  
						  if (!jT8.getText().isEmpty()  || !jT9.getText().isEmpty() 
								  || !jT10.getText().isEmpty() || !jT11.getText().isEmpty()) {
						  
						  String sql2="insert into address (contact_id,address_type,address,city,state,zip) VALUES ("
					  				+key+
					  				", 'Home Address', '"+jT8.getText()+"','"+jT9.getText()+"','"
							  +jT10.getText()+"','"+jT11.getText()+"')";
						   System.out.println(sql2);
						   
						   PreparedStatement pstmt2 = conn.prepareStatement(sql2, Statement.RETURN_GENERATED_KEYS);
						   
						   Integer i2 = pstmt2.executeUpdate();
						   System.out.println(i2);
						   
						  }
						  
						  if (!jT12.getText().isEmpty()  || !jT13.getText().isEmpty() ) {
							  
						   String sql3="insert into phone (contact_id,phone_type,area_code,number) VALUES ("
					  				+key+
					  				", 'Work Phone', '"+jT12.getText()+"','"+jT13.getText()+"')";
						   System.out.println(sql3);
						   
						   PreparedStatement pstmt3 = conn.prepareStatement(sql3, Statement.RETURN_GENERATED_KEYS);
						   
						   Integer i3 = pstmt3.executeUpdate();
						   System.out.println(i3);
						  
						  }
						  
						  if (!jT14.getText().isEmpty()  || !jT15.getText().isEmpty() ) {
						  
						   String sql4="insert into phone (contact_id,phone_type,area_code,number) VALUES ("
					  				+key+
					  				", 'Home Phone', '"+jT14.getText()+"','"+jT15.getText()+"')";
						   System.out.println(sql4);
						   
						   PreparedStatement pstmt4 = conn.prepareStatement(sql4, Statement.RETURN_GENERATED_KEYS);
						   
						   Integer i4 = pstmt4.executeUpdate();
						   System.out.println(i4);
						   
						  }
						  
						  if (!jT16.getText().isEmpty()  || !jT17.getText().isEmpty() ) {
						   
						   String sql5="insert into phone (contact_id,phone_type,area_code,number) VALUES ("
					  				+key+
					  				", 'Cell Phone', '"+jT16.getText()+"','"+jT17.getText()+"')";
						   System.out.println(sql5);
						   
						   PreparedStatement pstmt5 = conn.prepareStatement(sql5, Statement.RETURN_GENERATED_KEYS);
						   
						   Integer i5 = pstmt5.executeUpdate();
						   System.out.println(i5);
						   
						  }
						   
						  
						     
						  }

					      
				   catch(Exception e) {
				   System.out.println("Error:"+e);
				   }
				   
				   this.setVisible(false);
				   Welcome w = new Welcome();
	       		   w.setVisible(true);
				   System.out.println("Completed");
				   
			   }

			
}


