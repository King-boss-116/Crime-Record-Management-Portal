import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


class Project1 implements ActionListener{

	JFrame f1;
	JLabel l1;
	JButton b1,b2;

	public Project1(){
	
		f1=new JFrame();
		f1.setSize(500,500);
		l1=new JLabel("WELCOME TO THE HELP BANK");
		b1=new JButton("CLICK HERE TO CONTINUE");
		b2=new JButton("EXIT");

		f1.add(l1);
		f1.add(b1);
		f1.add(b2);
	
		l1.setBounds(200,200,100,30);
		b1.setBounds(150,400,100,30);
		b2.setBounds(300,400,100,30);
		
		f1.setVisible(true);
		f1.setLayout(null);

		b1.addActionListener(this);
		b2.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			new MultiDiv();
		}
		if(e.getSource()==b2)
		{
			System.exit(0);
		}
	
	}


}









class Project1Demo{
	
	public static void main(String arg[]){

		new Project1();

	}
	



}