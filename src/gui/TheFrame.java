package gui;
import javax.swing.*;
public class TheFrame extends JFrame
{
	JButton b1,b2,b3;
	JPanel p1;
	public TheFrame()
	{
		super("The Frame");
		p1=new JPanel();
		b1=new JButton("Button1");
		b2=new JButton("Button2");
		b3=new JButton("Button3");
		add(p1);
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		TheFrame f=new TheFrame();
	}

}
