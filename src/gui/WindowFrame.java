package gui;
import java.awt.*;
import java.awt.event.*;
public class WindowFrame extends Frame implements WindowListener 
{
	public WindowFrame()
	{
		addWindowListener(this);
		setSize(500,500);
		setVisible(true);
	}
	public void windowClosing(WindowEvent evt)
	{
		System.exit(0);
	}
	public void windowClosed(WindowEvent evt)
	{
		
	}public void windowOpened(WindowEvent evt)
	{
		
	}
	public void windowActivated(WindowEvent evt)
	{
		
	}
	public void windowDeactivated(WindowEvent evt)
	{
		
	}
	public void windowIconified(WindowEvent evt)
	{
		
	}
	public void windowDeiconified(WindowEvent evt)
	{
		
	}
	public static void main(String[] args) 
	{
		WindowFrame fr=new WindowFrame();
	}
}
