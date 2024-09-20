package gui;
import javax.swing.*;
import java.awt.*;
public class BorderFrame extends JFrame
{
	JButton b1,b2,b3,b4;
	JTextArea ta;
	JPanel p1;
	BorderLayout b;
	public BorderFrame()
	{
		p1=new JPanel();
		 b=new BorderLayout(20,20);
		 p1.setLayout(b);
		 b1=new JButton("Button1");
		 b2=new JButton("Button2");
		 b3=new JButton("Button3");
		 b4=new JButton("Button4");
		 ta=new JTextArea(8,9);
		 add(p1);
		 p1.add("North",b1);
		 p1.add("South",b2);
		 p1.add("East",b3);
		 p1.add("West",b4);
		 p1.add("Center",ta);
		 setSize(400,400);
		 setVisible(true);
	}
	public static void main(String[] args) 
	{
		BorderFrame fr=new BorderFrame();
	}
}
