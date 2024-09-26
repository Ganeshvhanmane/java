package gui;
import java.awt.*;
import java.awt.event.*;
public class WindowFrame3 extends Frame
{
	public WindowFrame3()
	{
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent evt)
			{
				System.exit(0);
			}
		});
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		WindowFrame3 fr=new WindowFrame3();
	}
}
