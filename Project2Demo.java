import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Graphics;


class Project2 implements ActionListener{
	JButton b1;
	JLabel l1,l2;
	JFrame f1;
	
	
	public Project2(){
		
		f1=new JFrame();
		f1.setSize(2055,2055);
		
		b1=new JButton("Press for Continue");
		l1=new JLabel("Welcome to the First Crime Management Portal Of India");
		l2=new JLabel("Permitted and Verified by ncrb,India");
		
		f1.add(l1);
		f1.add(l2);
		f1.add(b1);
		f1.setTitle("CRIME-MANAGEMENT-PORTAL");
		f1.setBackground(Color.BLUE);
		
		l1.setBounds(450,100,800,100);
		l2.setBounds(700,700,400,100);
		b1.setBounds(700,400,200,30);
		l1.setFont (new Font ("TimesRoman", Font.BOLD | Font.ITALIC, 32));;
		b1.addActionListener(this);
		f1.setLayout(null);
		f1.setVisible(true);
	
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			
			JOptionPane.showMessageDialog(null,"DIRECTING TO HOMEPAGE:");
			new Project3();
		}
	
	}	
}

class Project2Demo{

	public static void main(String arg[]){
	
	
		Project2 p2=new Project2();
	
	
	}


}