import java.util.Scanner;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Font;
import java.awt.Graphics;
import java.sql.*;
import java.awt.*;



class Project6 implements ActionListener {
	
	JFrame f1;
	JLabel l1;
	JButton b1;
	JTextField t1;
	
	
	public Project6(){
		
		f1=new JFrame();
		f1.setSize(2080,2080);
		f1.setBackground(Color.RED);
		l1=new JLabel("Enter the Employee Record Id");
		t1=new JTextField();
		b1=new JButton("CHECK");
		
		b1.setFont(new Font("Georgia",Font.BOLD,20));
		l1.setFont(new Font("TimesNewRoman",Font.ITALIC,40));
		t1.setFont(new Font("Georgia",Font.ITALIC,30));
		f1.add(l1);
		f1.add(b1);
		f1.add(t1);
		f1.setTitle("Searching Record!*-|-*");
		
		l1.setBounds(400,250,500,50);
		b1.setBounds(600,450,300,50);
		t1.setBounds(1000,250,200,50);
		
		b1.addActionListener(this);
		
		f1.setLayout(null);
		f1.setVisible(true);
		
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			JOptionPane.showMessageDialog(null,"We are procerssing your request");
			int a1=Integer.parseInt(t1.getText());
			try{
				
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost/Dbms_review?user=root&password=");
				String qry="select * from employee where E_Id is=?";
				PreparedStatement ps=con.prepareStatement(qry);
				ResultSet rs=ps.executeQuery();
				while(rs.next()){
					
					if(E_Id==a1)
					{
						System.out.println("Emp_Name is"+E_Name);
					}
					//System.out.println("empname  is\t"+empname);
					//System.out.println("empno  is\t\t"+empno);
					//System.out.println("empsal is\t"+empsal);
					//System.out.println("empdepartment is\t"+empdepartment);
					//System.out.println("empdepartment is\t"+m);
				}	
			
			}
			catch(ClassNotFoundException | SQLException e1)
			{
					System.out.println(e1);
			}
		}
			
	}
	
}



class Project6Demo{

	public static void main(String arg[]){
		Project6 p6=new Project6();
	}


}