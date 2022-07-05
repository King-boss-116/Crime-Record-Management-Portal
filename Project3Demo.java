import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Graphics;


class Project3 implements ActionListener{

	JButton b1,b2;
	JLabel l1,l2;
	JFrame f1;
	
	
	public Project3(){
		
		f1=new JFrame();
		f1.setSize(2055,2055);
		
		b1=new JButton("USER");
		b2=new JButton("ADMIN");
		l1=new JLabel("Welcome to the Home Page");
		l2=new JLabel("ARE YOU?");
		
		f1.add(l1);
		f1.add(b1);
		f1.add(l2);
		f1.add(b2);
		
		f1.setTitle("HOME-PAGE");
		f1.setBackground(Color.RED);
		
		l1.setBounds(550,100,700,100);
		l2.setBounds(730,220,200,100);
		b1.setBounds(700,400,200,30);
		b2.setBounds(700,500,200,30);
		
		l1.setFont (new Font ("TimesRoman", Font.BOLD, 40));
		l2.setFont (new Font ("Cursive", Font.ITALIC, 30));
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		f1.setLayout(null);
		f1.setVisible(true);
	
	}
	
	public void actionPerformed(ActionEvent e){
	
		if(e.getSource()==b1)
		{
			JOptionPane.showMessageDialog(null,"Hi User");
			new Project4();
		}
		if(e.getSource()==b2)
		{
			JOptionPane.showMessageDialog(null,"Hi Admin");
			new Project5();
		}
	
	}
	

}




class Project3Demo{
	public static void main(String arg[]){
	
		Project3 p3=new Project3();
		
	
	
	}




}
