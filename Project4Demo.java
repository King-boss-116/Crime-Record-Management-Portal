import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Graphics;

class Project4 implements ActionListener{
	JFrame f1;
	JButton b1,b2,b3;
	JLabel l1;
	public Project4(){
		
		f1=new JFrame();
		f1.setSize(2055,2055);
		
		
		l1=new JLabel("Are You.......");
		
		b1=new JButton("Employeer");
		b2=new JButton("Housing Companies");
		b3=new JButton("Security Services ");
		
		f1.add(l1);
		f1.add(b1);
		f1.add(b2);
		f1.add(b3);
		
		f1.setTitle("Decession Page!");
		f1.setBackground(Color.RED);
		
		l1.setBounds(700,50,200,100);
		
		b1.setBounds(700,210,200,100);
		b2.setBounds(650,410,300,100);
		b3.setBounds(700,610,200,100);
		
		l1.setFont (new Font ("TimesRoman", Font.BOLD, 40));
		b1.setFont (new Font ("Georgia", Font.ITALIC,20));
		b2.setFont (new Font ("Georgia", Font.ITALIC,20));
		b3.setFont (new Font ("Georgia",Font.ITALIC,20));
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		f1.setLayout(null);
		f1.setVisible(true);
		
	
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			JOptionPane.showMessageDialog(null,"Directing to your domain search");
			new Project71();
		}
		if(e.getSource()==b2)
		{
			JOptionPane.showMessageDialog(null,"Directing to your domain search");
			new Project73();
		}
		if(e.getSource()==b3)
		{
			JOptionPane.showMessageDialog(null,"Directing to your domain search");
			new Project72();
		}
	}
}
class Project4Demo{
	public static void main(String arg[])
	{
		Project4 P4=new Project4();
	
	}
}