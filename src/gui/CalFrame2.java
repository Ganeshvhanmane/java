package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CalFrame2 extends JFrame implements ActionListener
{
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JButton b1,b2,b3,b4;
	public CalFrame2()
	{
		setLayout(new FlowLayout());
		l1=new JLabel("Enter 1st Number");
		l2=new JLabel("Enter 2nd Number");
		l3=new JLabel("Answer");
		t1=new JTextField(30);
		t2=new JTextField(30);
		t3=new JTextField(30);
		b1=new JButton("+");
		b2=new JButton("-");
		b3=new JButton("*");
		b4=new JButton("/");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		setSize(400,400);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent evt)
	{
		Object obj=evt.getSource();
		int n1=Integer.parseInt(t1.getText());
		int n2=Integer.parseInt(t2.getText());
		int ans=0;
		if(obj==b1)
			ans=n1+n2;
		else if(obj==b2)
			ans=n1-n2;
		else if(obj==b3)
			ans=n1*n2;
		else if(obj==b4)
			ans=n1/n2;
		t3.setText(""+ans);
	}
	public static void main(String[] args) 
	{	
		CalFrame2 fr=new CalFrame2();
	}
}
