package gui;
import java.awt.*;
import java.awt.event.*;
public class WindowFrame2 extends Frame
{
	public WindowFrame2()
	{
		addWindowListener(new MyClass());
		setSize(500,500);
		setVisible(true);
	}
	class MyClass extends WindowAdapter
	{
		public void windowClosing(WindowEvent evt)
		{
			System.exit(0);
		}
	}
	public static void main(String[] args) 
	{
		WindowFrame2 fr=new WindowFrame2();
	}
}
