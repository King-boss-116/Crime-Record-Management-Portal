import java.sql.*;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.*;
import java.awt.*;


class Project9 implements ActionListener{
	
		JButton b1;
		JTextField t1,t2,t3,t4,t5,t6,t7;
		JLabel l1,l2,l3,l4,l5,l6,l7;
		JFrame f1;
	
		public Project9(){
			
			f1=new JFrame();
			f1.setTitle("Inserting A New Record in Police");
			f1.setSize(2070,2070);
			l1=new JLabel("Enter police id");
			l2=new JLabel("Enter police name");
			l3=new JLabel("Enter police age");
			l4=new JLabel("Enter police gender");
			l5=new JLabel("Enter police report date");
			l6=new JLabel("Enter police case involve id");
			l7=new JLabel("Enter police contribution provided");
					
			
			t1=new JTextField();
			t2=new JTextField();
			t3=new JTextField();
			t4=new JTextField();
			t5=new JTextField();
			t6=new JTextField();
			t7=new JTextField();
			
			
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
			f1.add(l7);
			f1.add(t7);
			
					
			f1.add(b1);
			
			f1.setVisible(true);
			f1.setLayout(null);
			
			l1.setBounds(200,40,200,100);
			t1.setBounds(350,65,200,40);
			l2.setBounds(950,40,200,100);
			t2.setBounds(1130,65,200,40);
			l3.setBounds(200,175,200,100);
			t3.setBounds(350,195,200,40);
			l4.setBounds(950,175,200,100);
			t4.setBounds(1130,205,200,40);
			l5.setBounds(200,320,200,100);
			t5.setBounds(350,355,200,40);
			l6.setBounds(950,325,200,100);
			t6.setBounds(1130,355,200,40);
			l7.setBounds(185,475,200,100);
			t7.setBounds(400,515,200,40);
			
			
			b1.setBounds(1040,520,150,50);
			
			b1.addActionListener(this);
		}
		
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==b1)
			{
				int a1=Integer.parseInt(t1.getText());
				t1.setText("police id is "+a1);
				int P_Id=a1;
				
				String b=t2.getText();
				t2.setText("police name is "+b);
				String P_Name=b;
				
				int c=Integer.parseInt(t3.getText());
				t3.setText("police age is " +c);
				int P_Age=c;
				
				String d=t4.getText();
				t4.setText("police gender is "+d);
				String P_Gender=d;
				
				String e1=t5.getText();
				t5.setText("police report date is "+e1);
				String Report_Date=e1;
				
				int f1=Integer.parseInt(t6.getText());
				t6.setText("police case involved id  is "+f1);
				int Case_Involved_Id=f1;
				
				String g1=t7.getText();
				t7.setText("police contribution provided is "+g1);
				String Contribution_Provided=g1;
				
				
				
				
				try{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost/Dbms_Review?user=root&password=");
					String qry="insert into police values (?,?,?,?,?,?,?) ";
					PreparedStatement ps=con.prepareStatement(qry);
					ps.setInt(1,P_Id);
					ps.setString(2,P_Name);
					ps.setInt(3,P_Age);
					ps.setString(4,P_Gender);
					ps.setString(5,Report_Date);
					ps.setInt(6,Case_Involved_Id);
					ps.setString(7,Contribution_Provided);
								
					
					int a=ps.executeUpdate();
					
						if(a==1)
						{
							System.out.println("police account is opened");
							System.out.println("congratulations");
							JOptionPane.showMessageDialog(null,"Congratulations! Your record has been added successfully");
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

class Project9Demo{
	public static void main(String arg[]){
		
		Project9 p9=new Project9();
	
		
	}

}