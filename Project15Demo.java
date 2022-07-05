import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Graphics;


class Project15 implements ActionListener{
	
		JFrame f1;
		JLabel l1;
		JTextField t1;
	
	
	public Project15(){
		
		f1=new JFrame();
		f1.setSize(2070,2070);
		f1.setBackground(Color.RED);
		f1.setTitle("Update EmployeeId Record As Admin");
		
		
		l1=new JLabel("Enter the new Id");
		t1=new JTextField();
		
		l1.setBounds(100,100,200,150);
		t1.setBounds(500,500,200,150);
		
		l1.setFont(new Font("Georgia",Font.BOLD,30));
		//t1.setFont(new Font("Georgia",Font.BOLD,10));
		
		f1.add(l1);
		f1.add(t1);
		
		
		
		f1.setVisible(true);
		f1.setLayout(null);
		
		
	}
	
	public void actionPerformed(ActionEvent e1){
		
		int a1=Integer.parseInt(t1.getText());
		try{
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/Dbms_Review?user=root&password=");
			String qry="update employee  set E_Id=? ";
			PreparedStatement ps=con.prepareStatement(qry);
			
			
			ps.setInt(1,a1);
			
			int a=ps.executeUpdate();
			
			if(a==1){
				System.out.println("Record updated");
				}
			else
				System.out.println("Record not updated");
		}
		catch(Exception e)
		{System.out.println(e);
		}
		
		
	}
	
	
	
	
}


class Project15Demo{
	public static void main(String arg[]){
	
		Project15 p15=new Project15();
	
	
	}





}