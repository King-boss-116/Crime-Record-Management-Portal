import java.sql.*;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.*;
import java.awt.*;


class Project7 implements ActionListener{
	
		JButton b1;
		JTextField t1,t2,t3,t4,t5,t6;
		JLabel l1,l2,l3,l4,l5,l6;
		JFrame f1;
	
		public Project7(){
			
			f1=new JFrame();
			f1.setTitle("Inserting A New Record in Employee");
			f1.setSize(2070,2070);
			l1=new JLabel("Enter employee id");
			l2=new JLabel("Enter employee name");
			l3=new JLabel("Enter employee state");
			l4=new JLabel("Enter employee age");
			l5=new JLabel("Enter employee crime-record");
			l6=new JLabel("Enter employee current status");
			
			t1=new JTextField();
			t2=new JTextField();
			t3=new JTextField();
			t4=new JTextField();
			t5=new JTextField();
			t6=new JTextField();
			
			b1=new JButton("Add");
			
			f1.add(l1);
			f1.add(t1);
			f1.add(l2);
			f1.add(t2);
			f1.add(l3);
			f1.add(t3);
			f1.add(l4);
			f1.add(t4);
			f1.add(l5);
			f1.add(t5);
			f1.add(l6);
			f1.add(t6);
					
			f1.add(b1);
			
			f1.setVisible(true);
			f1.setLayout(null);
			
			l1.setBounds(400,50,200,100);
			t1.setBounds(900,75,200,50);
			l2.setBounds(400,150,200,100);
			t2.setBounds(900,175,200,50);
			l3.setBounds(400,250,200,100);
			t3.setBounds(900,275,200,50);
			l4.setBounds(400,350,200,100);
			t4.setBounds(900,375,200,50);
			l5.setBounds(400,450,200,100);
			t5.setBounds(900,475,200,50);
			l6.setBounds(400,550,200,100);
			t6.setBounds(900,575,200,50);
			
			b1.setBounds(700,700,150,50);
			
			b1.addActionListener(this);
		}
		
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==b1)
			{
				int a1=Integer.parseInt(t1.getText());
				t1.setText("Emp id is "+a1);
				int E_Id=a1;
				
				String b=t2.getText();
				t2.setText("Emp name is "+b);
				String E_Name=b;
				
				String c=t3.getText();
				t3.setText("Emp state is " +c);
				String E_State=c;
				
				int d=Integer.parseInt(t4.getText());
				t4.setText("Emp age is "+d);
				int E_Age=d;
				
				String e1=t5.getText();
				t4.setText("Emp crime record is "+d);
				String E_Crime_Record=e1;
				
				String f=t6.getText();
				t4.setText("Emp current status  is "+d);
				String E_Current_Status=f;
				
				try{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost/Dbms_Review?user=root&password=");
					String qry="insert into employee values (?,?,?,?,?,?) ";
					PreparedStatement ps=con.prepareStatement(qry);
					ps.setInt(1,E_Id);
					ps.setString(2,E_Name);
					ps.setString(3,E_State);
					ps.setInt(4,E_Age);
					ps.setString(5,E_Crime_Record);
					ps.setString(6,E_Current_Status);
					
					int a=ps.executeUpdate();
					
						if(a==1)
						{
							System.out.println("employee account is opened");
							System.out.println("congratulations");
							JOptionPane.showMessageDialog(null,"Congraculations! Your record has been added successfully");
						}
						else
							System.out.println("account not opened successfully");
					
					}
					catch(Exception g)
					{
						System.out.println(g.getMessage());
					}
			}
		}


			
			
			
		
		
}


class Project7Demo{
	public static void main(String arg[]){
		
		Project7 p7=new Project7();
		
		
	}




}