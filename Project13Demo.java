import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Graphics;


class Project13 implements ActionListener{
	
	JFrame f1;
	JLabel l1,l2;
	Choice c1;	
	JButton b1,b2,b3,b4,b5;
	
	public Project13(){
		
		f1=new JFrame();
		f1.setSize(2070,2070);
		f1.setBackground(Color.BLUE);
		f1.setTitle("Updating Employee Record As Admin");
		
		l1=new JLabel("What you wanna Update");
		
		
		b1=new JButton("Employee Name");
		b2=new JButton("Employee State");
		b3=new JButton("Employee Age");
		b4=new JButton("Employee Crime-Record");
		b5=new JButton("Employee Current-Status");
		
		c1=new Choice();
		c1.add("Employee Name");
		c1.add("Employee State");
		c1.add("Employee Age");
		c1.add("Employee Crime-Record");
		c1.add("Employee Current-Status");
		
		l1.setFont(new Font("Georgia",Font.ITALIC,30));
		c1.setFont(new Font("Georgia",Font.BOLD,20));
		
		
		b1.setFont(new Font("TimesNewRoman",Font.ITALIC,20));
		b2.setFont(new Font("TimesNewRoman",Font.ITALIC,20));
		b3.setFont(new Font("TimesNewRoman",Font.ITALIC,20));
		b4.setFont(new Font("TimesNewRoman",Font.ITALIC,20));
		b5.setFont(new Font("TimesNewRoman",Font.ITALIC,20));
		
		
		
		f1.add(l1);
		f1.add(c1);
		f1.add(b1);
		f1.add(b2);
		f1.add(b3);
		f1.add(b4);
		f1.add(b5);
		
		
		l1.setBounds(625,100,500,100);
		c1.setBounds(650,200,300,100);
		b1.setBounds(650,300,300,50);
		b2.setBounds(650,400,300,50);
		b3.setBounds(650,500,300,50);
		b4.setBounds(650,600,300,50);
		b5.setBounds(650,700,300,50);
		
		f1.setLayout(null);
		f1.setVisible(true);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e){
		
		if(e.getSource()==b1){
			new Project16();
		}
		
		else if(e.getSource()==b2){
			new Project17();
		}
		
		else if(e.getSource()==b3){
			new Project18();
		}
		
		else if(e.getSource()==b4){
			new Project19();
		}
		else if(e.getSource()==b5){
			new Project20();
		}
	}
	
	
}


class Project13Demo{
	
	public static void main(String arg[]){
		
		Project13 p13=new Project13();
		
		
	}	
}