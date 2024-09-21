package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class KeyFrame extends JFrame implements KeyListener
{
	String s1;
	public KeyFrame()
	{
		s1="";
		addKeyListener(this);
		setSize(500,500);
		setVisible(true);
	}
	public void keyTyped(KeyEvent evt)
	{
		s1=s1+evt.getKeyChar();
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(s1, 10, 50);
	}
	public void keyPressed(KeyEvent evt)
	{
		
	}
	public void keyReleased(KeyEvent evt)
	{
		
	}
	public static void main(String[] args) 
	{
		KeyFrame fr=new KeyFrame();
	}
}
