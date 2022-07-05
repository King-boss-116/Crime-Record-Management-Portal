import java.util.Scanner;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Font;
import java.awt.Graphics;
import java.sql.*;
import java.awt.*;



class Project72 implements ActionListener {
	
	JFrame f1;
	JLabel l1,l2;
	JButton b1;
	JTextField t1,t2;
	JButton b2,b3,b4,b5,b6,b7,b8;
	
	public Project72(){
		
		f1=new JFrame();
		f1.setSize(2080,2080);
		f1.setBackground(Color.RED);
		
		l1=new JLabel("Enter the Police Record Id");
		t1=new JTextField();
		l2=new JLabel("Enter the Case_Involved Id");
		t2=new JTextField();
		b1=new JButton("SEARCH");
		
		
		b1.setFont(new Font("Georgia",Font.BOLD,20));
		
		l1.setFont(new Font("TimesNewRoman",Font.ITALIC,32));
		t1.setFont(new Font("Georgia",Font.ITALIC,30));
		l2.setFont(new Font("TimesNewRoman",Font.ITALIC,32));
		t2.setFont(new Font("Georgia",Font.ITALIC,30));

		f1.add(l1);
		f1.add(b1);
		f1.add(t1);
		f1.add(l2);
		f1.add(t2);
		
		
		f1.setTitle("Searching Record!*-|-*");
		
		l1.setBounds(400,80,500,50);
		l2.setBounds(400,180,500,50);
		b1.setBounds(650,280,300,50);
		t1.setBounds(1000,80,200,50);
		t2.setBounds(1000,180,200,50);
		
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
			int b1=Integer.parseInt(t2.getText());
			
			try{	
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost/Dbms_Review?user=root&password=");
				String qry="select * from police";
				PreparedStatement ps=con.prepareStatement(qry);
				
				ResultSet rs=ps.executeQuery();//object of resultset will store the information of execute query interface
				while(rs.next()){//it points toward the record till the time the pointer points towards the null reference
					
					int P_Id=rs.getInt(1);
					int Case_Involoved_Id=rs.getInt(6);
					String P_Name,P_Gender,Report_Date,Contribution_Provided;
					String CS_Id,Age,Id;
					int P_Age;
					if(P_Id==a1 && Case_Involoved_Id==b1)
					{
						System.out.println("Found");
						System.out.println("Police Id is "+P_Id);
						Id=Integer.toString(P_Id);
						
						P_Name=rs.getString(2);
						System.out.println("Police Name is "+P_Name);
						
						P_Age=rs.getInt(3);
						Age=Integer.toString(P_Age);
						System.out.println("Police Age is "+Age);
						
						P_Gender=rs.getString(4);
						System.out.println("Police Gender is "+P_Gender);
						
						Report_Date=rs.getString(5);
						System.out.println("Police Report_Date is "+Report_Date);
						
						Case_Involoved_Id=rs.getInt(6);
						System.out.println("Police Case_Involved_Id is "+Case_Involoved_Id);
						CS_Id=Integer.toString(Case_Involoved_Id);
						
						Contribution_Provided=rs.getString(7);
						System.out.println("Contribution_Provided is "+Contribution_Provided);
						
						
						JOptionPane.showMessageDialog(null,"Record Successfully Found");
						
						b2=new JButton("Police Id is "+Id);
						b3=new JButton("Police Name is "+P_Name);
						b4=new JButton("Police Age is "+Age);
						b5=new JButton("Police Gender is "+P_Gender);
						b6=new JButton("Police Report_Date is "+Report_Date);
						b7=new JButton("Police Case_Involved_Id is "+CS_Id);
						b8=new JButton("Contribution_Provided is "+Contribution_Provided);
						
						b2.setBounds(520,400,600,50);
						b3.setBounds(520,450,600,50);
						b4.setBounds(520,500,600,50);
						b5.setBounds(520,550,600,50);
						b6.setBounds(520,600,600,50);
						b7.setBounds(520,650,600,50);
						b8.setBounds(100,700,1300,50);
						
						b2.setFont(new Font("Georgia",Font.BOLD,20));
						b3.setFont(new Font("Georgia",Font.BOLD,20));
						b4.setFont(new Font("Georgia",Font.BOLD,20));
						b5.setFont(new Font("Georgia",Font.BOLD,20));
						b6.setFont(new Font("Georgia",Font.BOLD,20));
						b7.setFont(new Font("Georgia",Font.BOLD,20));
						b8.setFont(new Font("Georgia",Font.BOLD,20));
			
						
						f1.add(b2);
						f1.add(b3);
						f1.add(b4);
						f1.add(b5);
						f1.add(b6);
						f1.add(b7);
						f1.add(b8);
					
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



class Project72Demo{

	public static void main(String arg[]){
		Project72 p72=new Project72();
	}


}