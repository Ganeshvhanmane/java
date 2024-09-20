package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ColorFrame extends JFrame implements ActionListener
{
	JButton b1,b2,b3;
	public ColorFrame()
	{
		setLayout(new FlowLayout());
		b1=new JButton("Red");
		b2=new JButton("Blue");
		b3=new JButton("Green");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		add(b1);
		add(b2);
		add(b3);
		setSize(500,500);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent evt)
	{
		Object obj=evt.getSource();
		if(obj==b1)
			getContentPane().setBackground(Color.RED);
		else if(obj==b2)
			getContentPane().setBackground(Color.BLUE);
		else if(obj==b3)
			getContentPane().setBackground(Color.GREEN);
	}
	public static void main(String[] args) 
	{
		ColorFrame fr=new ColorFrame();
	}

}
