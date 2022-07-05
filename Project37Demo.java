import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Graphics;


class Project37 implements ActionListener{
	
	JFrame f1;
	JLabel l1,l2;
	Choice c1;	
	JButton b1,b3,b4,b5,b7;
	
	public Project37(){
		
		f1=new JFrame();
		f1.setSize(2070,2070);
		f1.setBackground(Color.BLUE);
		f1.setTitle("Updating Police Record As Admin");
		
		l1=new JLabel("What you wanna Update");
		
		
		b1=new JButton("Police Name");
		b3=new JButton("Police Age");
		b4=new JButton("Police Gender");
		b5=new JButton("Police Report Date");
		b7=new JButton("Contibution Provided");
		
		
		
		c1=new Choice();
		c1.add("Police Name");
		c1.add("Police Age");
		c1.add("Police Gender");
		c1.add("Police Report Date");
		c1.add("Police Contibution Provided");
		
		
		
		l1.setFont(new Font("Georgia",Font.ITALIC,30));
		c1.setFont(new Font("Georgia",Font.BOLD,20));
		
		
		b1.setFont(new Font("TimesNewRoman",Font.ITALIC,20));
		b3.setFont(new Font("TimesNewRoman",Font.ITALIC,20));
		b4.setFont(new Font("TimesNewRoman",Font.ITALIC,20));
		b5.setFont(new Font("TimesNewRoman",Font.ITALIC,20));
		b7.setFont(new Font("TimesNewRoman",Font.ITALIC,20));
		
		
		f1.add(l1);
		f1.add(c1);
		f1.add(b1);
		f1.add(b3);
		f1.add(b4);
		f1.add(b5);
		f1.add(b7);
		
		
		
		l1.setBounds(625,50,500,100);
		c1.setBounds(650,150,300,100);
		b1.setBounds(650,300,300,50);
		b3.setBounds(650,350,300,50);
		b4.setBounds(650,400,300,50);
		b5.setBounds(650,450,300,50);
		b7.setBounds(650,500,300,50);
		
		
		f1.setLayout(null);
		f1.setVisible(true);
		
		b1.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b7.addActionListener(this);
		
		
	}
	
	public void actionPerformed(ActionEvent e){
		
		if(e.getSource()==b1){
			new Project31();
		}
		
		else if(e.getSource()==b3){
			new Project32();
		}
		
		else if(e.getSource()==b4){
			new Project33();
		}
		
		else if(e.getSource()==b5){
			new Project34();
		}
		
		else if(e.getSource()==b7){
			new Project35();
		}
		
	}
	
}


class Project37Demo{
	
	public static void main(String arg[]){
		
		Project37 p37=new Project37();
		
		
	}	
}