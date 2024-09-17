package gui;
import javax.swing.*;
public class MyFrame extends JFrame
{
	public MyFrame()
	{
		super("My Frame");
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		MyFrame f=new MyFrame();
	}

}
