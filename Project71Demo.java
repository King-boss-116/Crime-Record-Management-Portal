import java.util.Scanner;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Font;
import java.awt.Graphics;
import java.sql.*;
import java.awt.*;



class Project71 implements ActionListener {
	
	JFrame f1;
	JLabel l1;
	JButton b1;
	JTextField t1;
	JButton b2,b3,b4,b5,b6,b7;
	
	public Project71(){
		
		f1=new JFrame();
		f1.setSize(2080,2080);
		f1.setBackground(Color.RED);
		l1=new JLabel("Enter the Employee Record Id");
		t1=new JTextField();
		b1=new JButton("SEARCH");
		
		
		b1.setFont(new Font("Georgia",Font.BOLD,20));
		
		l1.setFont(new Font("TimesNewRoman",Font.ITALIC,32));
		t1.setFont(new Font("Georgia",Font.ITALIC,30));
		

		f1.add(l1);
		f1.add(b1);
		
		f1.add(t1);
		
		f1.setTitle("Searching Record!*-|-*");
		
		l1.setBounds(400,100,500,50);
		b1.setBounds(650,250,300,50);
		t1.setBounds(1000,100,200,50);
				
		b1.addActionListener(this);
		
		f1.setLayout(null);
		f1.setVisible(true);
		
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			JOptionPane.showMessageDialog(null,"We are processing your request");
			int a1=Integer.parseInt(t1.getText());
			try{	
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost/Dbms_Review?user=root&password=");
				String qry="select * from employee";
				PreparedStatement ps=con.prepareStatement(qry);
				
				ResultSet rs=ps.executeQuery();//object of resultset will store the information of execute query interface
				while(rs.next()){//it points toward the record till the time the pointer points towards the null reference
					
					int E_Id=rs.getInt(1);
					String E_Name,E_State,E_Crime_Record,E_Current_Status;
					int E_Age;
					String Age,Id;
					if(E_Id==a1)
					{
						System.out.println("Found");
						System.out.println("Employee Id is "+E_Id);
						Id=Integer.toString(E_Id);
						E_Name=rs.getString(2);
						System.out.println("Employee Name is "+E_Name);
						E_State=rs.getString(3);
						System.out.println("Employee State is "+E_State);
						E_Age=rs.getInt(4);
						Age=Integer.toString(E_Age);
						System.out.println("Employee Age is "+E_Age);
						E_Crime_Record=rs.getString(5);
						System.out.println("Employee Crime_Record is "+E_Crime_Record);
						E_Current_Status=rs.getString(6);
						System.out.println("Employee Current_Status is "+E_Current_Status);
						JOptionPane.showMessageDialog(null,"Record Successfully Found");
						
						b2=new JButton("Employee Id is "+Id);
						b3=new JButton("Employee Name is "+E_Name);
						b4=new JButton("Employee Age is "+Age);
						b5=new JButton("Employee State is "+E_State);
						b6=new JButton("Employee Crime_Record is "+E_Crime_Record);
						b7=new JButton("Employee Current_Status is "+E_Current_Status);
						b2.setBounds(520,400,800,50);
						b3.setBounds(520,450,800,50);
						b4.setBounds(520,500,800,50);
						b5.setBounds(520,550,800,50);
						b6.setBounds(520,600,800,50);
						b7.setBounds(520,650,800,50);
						b2.setFont(new Font("Georgia",Font.BOLD,20));
						b3.setFont(new Font("Georgia",Font.BOLD,20));
						b4.setFont(new Font("Georgia",Font.BOLD,20));
						b5.setFont(new Font("Georgia",Font.BOLD,20));
						b6.setFont(new Font("Georgia",Font.BOLD,20));
						b7.setFont(new Font("Georgia",Font.BOLD,20));
						f1.add(b2);
						f1.add(b3);
						f1.add(b4);
						f1.add(b5);
						f1.add(b6);
						f1.add(b7);
						
					
					}
					
					
				}
			}
		
			catch(Exception e1)
			{
				System.out.println(e1.getMessage());
			}
		}
			
	}
	
}



class Project71Demo{

	public static void main(String arg[]){
		Project71 p71=new Project71();
	}


}