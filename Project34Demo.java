
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Graphics;




class Project34 implements ActionListener{
	
	JFrame f1;
	JLabel l1,l2,l3;
	JButton b1;
	JTextField t1,t2,t3;
	
	public Project34(){
		
		f1=new JFrame();
		f1.setSize(2055,2055);
		f1.setTitle("Updating Police Report Date As Admin");
		
		l2=new JLabel("Write the Police Id");
		t2=new JTextField(); 
		l3=new JLabel("Write the Case Involved Id");
		t3=new JTextField(); 
		l1=new JLabel("Write the New Updated Value for Police Report_Date");
		t1=new JTextField();
		b1=new JButton("Modify");
		
		l3.setBounds(600,300,200,50);
		l2.setBounds(600,200,200,50);
		t1.setBounds(800,200,200,50);
		l1.setBounds(490,400,350,50);
		b1.setBounds(700,500,100,50);
		t2.setBounds(800,300,200,50);
		t3.setBounds(800,400,200,50);
		
		f1.add(l1);
		f1.add(l2);
		f1.add(b1);
		f1.add(t1);
		f1.add(t2);
		f1.add(l3);
		f1.add(t3);
		
		b1.addActionListener(this);
		
		f1.setLayout(null);
		f1.setVisible(true);
		
		
	}
	
	public void actionPerformed(ActionEvent e){
		
		if(e.getSource()==b1)
		{
			int a1=Integer.parseInt(t1.getText());
			int b1=Integer.parseInt(t2.getText());
			String c1=t3.getText();
			
			try{
				
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost/Dbms_Review?user=root&password=");
				String qry="update police set Report_Date=? where P_Id=? and Case_Involoved_Id=?";
				PreparedStatement ps=con.prepareStatement(qry);
							
				ps.setString(1,c1);			
				ps.setInt(2,a1);
				ps.setInt(3,b1);
				
				
				int a=ps.executeUpdate();
				
				if(a==1){
					System.out.println("Record updated");
					}
				else
					System.out.println("Record not updated");
			}
			catch(Exception e1)
			{
					System.out.println(e1);
			}
			JOptionPane.showMessageDialog(null,"Record Updated Successfully");
		}
		
	} 







}



class Project34Demo{

	public static void main(String arg[]){
	
		Project34 p34=new Project34();
		
	
	}


}