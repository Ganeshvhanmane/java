package gui;
import javax.swing.*;
import java.awt.*;
public class FlowFrame extends JFrame 
{
	JButton b1,b2,b3;
	FlowLayout f;
	public FlowFrame()
	{
		f=new FlowLayout(FlowLayout.LEFT,10,10);
		setLayout(f);
		b1=new JButton("Button1");
		b2=new JButton("Button2");
		b3=new JButton("Button3");
		add(b1);
		add(b2);
		add(b3);
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		FlowFrame fr=new FlowFrame();
	}

}
