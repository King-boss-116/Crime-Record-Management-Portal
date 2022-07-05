import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Graphics;


class Project36 implements ActionListener{
	
	JFrame f1;
	JLabel l1,l2;
	Choice c1;	
	JButton b1,b2,b3,b4,b5,b6,b7,b8;
	
	public Project36(){
		
		f1=new JFrame();
		f1.setSize(2070,2070);
		f1.setBackground(Color.BLUE);
		f1.setTitle("Updating Criminal Record As Admin");
		
		l1=new JLabel("What you wanna Update");
		
		
		b1=new JButton("Criminal Name");
		b2=new JButton("Criminal State");
		b3=new JButton("Criminal Age");
		b4=new JButton("Criminal Gender");
		b5=new JButton("Criminal Crime");
		b6=new JButton("Criminal Report Date");
		b7=new JButton("Criminal Background");
		b8=new JButton("Criminal Status");
		
		
		c1=new Choice();
		c1.add("Criminal Name");
		c1.add("Criminal State");
		c1.add("Criminal Age");
		c1.add("Criminal Gender");
		c1.add("Criminal Crime");
		c1.add("Criminal Report Date");
		c1.add("Criminal Background");
		c1.add("Criminal Status");
		
		
		l1.setFont(new Font("Georgia",Font.ITALIC,30));
		c1.setFont(new Font("Georgia",Font.BOLD,20));
		
		
		b1.setFont(new Font("TimesNewRoman",Font.ITALIC,20));
		b2.setFont(new Font("TimesNewRoman",Font.ITALIC,20));
		b3.setFont(new Font("TimesNewRoman",Font.ITALIC,20));
		b4.setFont(new Font("TimesNewRoman",Font.ITALIC,20));
		b5.setFont(new Font("TimesNewRoman",Font.ITALIC,20));
		b6.setFont(new Font("TimesNewRoman",Font.ITALIC,20));
		b7.setFont(new Font("TimesNewRoman",Font.ITALIC,20));
		b8.setFont(new Font("TimesNewRoman",Font.ITALIC,20));
		
		
		f1.add(l1);
		f1.add(c1);
		f1.add(b1);
		f1.add(b2);
		f1.add(b3);
		f1.add(b4);
		f1.add(b5);
		f1.add(b6);
		f1.add(b7);
		f1.add(b8);
		
		
		l1.setBounds(625,50,500,100);
		c1.setBounds(650,150,300,100);
		b1.setBounds(650,250,300,50);
		b2.setBounds(650,300,300,50);
		b3.setBounds(650,350,300,50);
		b4.setBounds(650,400,300,50);
		b5.setBounds(650,450,300,50);
		b6.setBounds(650,500,300,50);
		b7.setBounds(650,550,300,50);
		b8.setBounds(650,600,300,50);
		
		f1.setLayout(null);
		f1.setVisible(true);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e){
		
		if(e.getSource()==b1){
			new Project21();
		}
		
		else if(e.getSource()==b2){
			new Project22();
		}
		
		else if(e.getSource()==b3){
			new Project23();
		}
		
		else if(e.getSource()==b4){
			new Project24();
		}
		else if(e.getSource()==b5){
			new Project25();
		}
		else if(e.getSource()==b6){
			new Project26();
		}
		else if(e.getSource()==b7){
			new Project27();
		}
		else if(e.getSource()==b8){
			new Project28();
		}
	}
	
	
}


class Project36Demo{
	
	public static void main(String arg[]){
		
		Project36 p36=new Project36();
		
		
	}	
}