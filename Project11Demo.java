import java.awt.*;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.*;
import java.sql.*;

class Project11 implements ActionListener{
	JFrame f1;
	JLabel l1;
	JButton b1,b2,b3;
	
	public Project11(){
		
		f1=new JFrame();
		f1.setSize(2070,2070);
		l1=new JLabel("FROM WHICH DOMAIN YOU WANT TO DELETE RECORD.............?");
		b1=new JButton("Delete from Employee");
		b2=new JButton("Delete from Criminal");
		b3=new JButton("Delete from Police");
		
		
		f1.setBackground(Color.RED);
		f1.add(l1);
		f1.add(b1);
		f1.add(b2);
		f1.add(b3);
		
		l1.setFont(new Font("TimesNewRoman",Font.BOLD,20));
		b1.setFont(new Font("Georgia",Font.ITALIC,20));
		b2.setFont(new Font("Georgia",Font.ITALIC,20));
		b3.setFont(new Font("Georgia",Font.ITALIC,20));
		f1.setTitle("Deleting Record!*-|-*");
		
		
		f1.setVisible(true);
		f1.setLayout(null);
		
		l1.setBounds(550,100,650,60);
		b1.setBounds(650,250,300,50);
		b2.setBounds(650,450,300,50);
		b3.setBounds(650,650,300,50);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);		
		
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1){
			JOptionPane.showMessageDialog(null,"Directing to Delete Employee Record Page");
			new Project41();
		}	
		
		if(e.getSource()==b2){
			JOptionPane.showMessageDialog(null,"Directing to Delete Criminal Record Page");
			new Project42();
		}
		
		if(e.getSource()==b3){
			JOptionPane.showMessageDialog(null,"Directing to Delete Police Record Page");
			new Project43();
		}
	
	
	
	
	}




}


class Project11Demo{

	public static void main(String arg[]){
	
		Project11 p11=new Project11();
		
	
	}



}