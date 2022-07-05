import java.util.Scanner;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Font;
import java.awt.Graphics;
import java.sql.*;	
import java.awt.*;



class Project73 implements ActionListener {
	
	JFrame f1;
	JLabel l1;
	JButton b1;
	JTextField t1;
	JButton b2,b3,b4,b5,b6,b7,b8,b9,b10;
	
	public Project73(){
		
		f1=new JFrame();
		f1.setSize(2080,2080);
		f1.setBackground(Color.RED);
		l1=new JLabel("Enter the Criminal Record Id");
		t1=new JTextField();
		b1=new JButton("SEARCH");
		
		
		b1.setFont(new Font("Georgia",Font.BOLD,20));
		
		l1.setFont(new Font("TimesNewRoman",Font.ITALIC,32));
		t1.setFont(new Font("Georgia",Font.ITALIC,30));
		

		f1.add(l1);
		f1.add(b1);
		
		f1.add(t1);
		
		f1.setTitle("Searching Record!*-|-*");
		
		l1.setBounds(400,80,500,50);
		b1.setBounds(650,180,300,50);
		t1.setBounds(1000,80,200,50);
				
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
				String qry="select * from Criminals";
				PreparedStatement ps=con.prepareStatement(qry);
				
				ResultSet rs=ps.executeQuery();//object of resultset will store the information of execute query interface
				while(rs.next()){//it points toward the record till the time the pointer points towards the null reference
					
					int Id=rs.getInt(1);
					String Name,State,Gender,Crime,Report_Date,Background,Status;
					int Age;
					String Age1,Id1;
					if(Id==a1)
					{
						System.out.println("Found");
						System.out.println("Criminal Id is "+Id);
						Id1=Integer.toString(Id);
						
						Name=rs.getString(2);
						System.out.println("Criminal Name is "+Name);
						
						State=rs.getString(3);
						System.out.println("Criminal State is "+State);
						
						Age=rs.getInt(4);
						Age1=Integer.toString(Age);
						System.out.println("Criminal Age is "+Age);
						
						Gender=rs.getString(5);
						System.out.println("Criminal Gender is "+Gender);
						
						Crime=rs.getString(6);
						System.out.println("Criminal Crime is "+Crime);
						
						Report_Date=rs.getString(7);
						System.out.println("Criminal Report_Date is "+Report_Date);
						
						Background=rs.getString(8);
						System.out.println("Criminal Background is "+Background);
						
						Status=rs.getString(7);
						System.out.println("Criminal Status is "+Status);
						
						JOptionPane.showMessageDialog(null,"Record Successfully Found");
						
						b2=new JButton("Criminal Id is "+Id);
						b3=new JButton("Criminal Name is "+Name);
						b4=new JButton("Criminal State is "+State);
						b5=new JButton("Criminal Age is "+Age1);
						b6=new JButton("Criminal Gender is "+Gender);
						b7=new JButton("Criminal Crime is "+Crime);
						b8=new JButton("Criminal Report_Date is "+Report_Date);
						b9=new JButton("Criminal Background is "+Background);
						b10=new JButton("Criminal Status is "+Status);
						
						
						b2.setBounds(520,300,600,50);
						b3.setBounds(520,350,600,50);
						b4.setBounds(520,400,600,50);
						b5.setBounds(520,450,600,50);
						b6.setBounds(520,500,600,50);
						b7.setBounds(410,550,850,50);
						b8.setBounds(520,600,600,50);
						b9.setBounds(410,650,850,50);
						b10.setBounds(520,700,600,50);
						
						b2.setFont(new Font("Georgia",Font.BOLD,20));
						b3.setFont(new Font("Georgia",Font.BOLD,20));
						b4.setFont(new Font("Georgia",Font.BOLD,20));
						b5.setFont(new Font("Georgia",Font.BOLD,20));
						b6.setFont(new Font("Georgia",Font.BOLD,20));
						b7.setFont(new Font("Georgia",Font.BOLD,20));
						b8.setFont(new Font("Georgia",Font.BOLD,20));
						b9.setFont(new Font("Georgia",Font.BOLD,20));
						b10.setFont(new Font("Georgia",Font.BOLD,20));
											
						
						f1.add(b2);
						f1.add(b3);
						f1.add(b4);
						f1.add(b5);
						f1.add(b6);
						f1.add(b7);
						f1.add(b8);
						f1.add(b9);
						f1.add(b10);
						
					
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



class Project73Demo{

	public static void main(String arg[]){
		Project73 p73=new Project73();
	}


}