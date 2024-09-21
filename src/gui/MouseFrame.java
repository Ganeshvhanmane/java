package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MouseFrame extends JFrame implements MouseListener
{
	int x,y;
	public MouseFrame()
	{
		addMouseListener(this);
		setSize(500,500);
		setVisible(true);
	}
	public void mouseClicked(MouseEvent evt)
	{
		x=evt.getX();
		y=evt.getY();
		repaint();//it calls paint method
	}
	public void paint(Graphics g)
	{
		String s1="X="+x+"Y="+y;
		g.drawString(s1, x, y);
	}
	public void mousePressed(MouseEvent evt)
	{
		
	}
	public void mouseEntered(MouseEvent evt)
	{
		
	}
	public void mouseExited(MouseEvent evt)
	{
		
	}
	public void mouseReleased(MouseEvent evt)
	{
		
	}
	public static void main(String[] args) 
	{
		MouseFrame fr=new MouseFrame();
	}
}
