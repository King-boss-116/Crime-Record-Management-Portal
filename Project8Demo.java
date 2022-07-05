import java.sql.*;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.*;
import java.awt.*;


class Project8 implements ActionListener{
	
		JButton b1;
		JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
		JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
		JFrame f1;
	
		public Project8(){
			
			f1=new JFrame();
			f1.setTitle("Inserting A New Record in Criminal");
			f1.setSize(2070,2070);
			l1=new JLabel("Enter criminal id");
			l2=new JLabel("Enter criminal name");
			l3=new JLabel("Enter criminal state");
			l4=new JLabel("Enter criminal age");
			l5=new JLabel("Enter criminal gender");
			l6=new JLabel("Enter criminal crime");
			l7=new JLabel("Enter criminal report date");
			l8=new JLabel("Enter criminal background");
			l9=new JLabel("Enter criminal status");
			
			
			t1=new JTextField();
			t2=new JTextField();
			t3=new JTextField();
			t4=new JTextField();
			t5=new JTextField();
			t6=new JTextField();
			t7=new JTextField();
			t8=new JTextField();
			t9=new JTextField();
			
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
			f1.add(l8);
			f1.add(t8);
			f1.add(l9);
			f1.add(t9);
					
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
			t7.setBounds(350,515,200,40);
			l8.setBounds(950,475,200,100);
			t8.setBounds(1130,515,200,40);
			l9.setBounds(200,650,200,100);
			t9.setBounds(350,685,200,40);
			
			b1.setBounds(1040,680,150,50);
			
			b1.addActionListener(this);
		}
		
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==b1)
			{
				int a1=Integer.parseInt(t1.getText());
				t1.setText("Criminal id is "+a1);
				int Id=a1;
				
				String b=t2.getText();
				t2.setText("Criminal name is "+b);
				String Name=b;
				
				String c=t3.getText();
				t3.setText("Criminal state is " +c);
				String State=c;
				
				int d=Integer.parseInt(t4.getText());
				t4.setText("Criminal age is "+d);
				int Age=d;
				
				String e1=t5.getText();
				t5.setText("Criminal gender is "+e1);
				String Gender=e1;
				
				String f1=t6.getText();
				t6.setText("Criminal crime  is "+f1);
				String Crime=f1;
				
				String g1=t7.getText();
				t6.setText("Criminal report date is "+g1);
				String Report_Date=g1;
				
				String h1=t8.getText();
				t8.setText("Criminal background is "+h1);
				String Background=h1;
				
				String i1=t9.getText();
				t9.setText("Criminal status is "+i1);
				String Status=i1;
				
				
				try{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost/Dbms_Review?user=root&password=");
					String qry="insert into criminals values (?,?,?,?,?,?,?,?,?) ";
					PreparedStatement ps=con.prepareStatement(qry);
					ps.setInt(1,Id);
					ps.setString(2,Name);
					ps.setString(3,State);
					ps.setInt(4,Age);
					ps.setString(5,Gender);
					ps.setString(6,Crime);
					ps.setString(7,Report_Date);
					ps.setString(8,Background);
					ps.setString(9,Status);
					
					
					int a=ps.executeUpdate();
					
						if(a==1)
						{
							System.out.println("criminal account is opened");
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

class Project8Demo{
	public static void main(String arg[]){
		
		Project8 p8=new Project8();
	
		
	}

}