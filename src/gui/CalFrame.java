package gui;
import javax.swing.*;
import java.awt.*;
public class CalFrame extends JFrame
{
	JPanel p1;
	JTextField t1;
	JButton b1[];
	GridLayout g;
	public CalFrame()
	{
		p1=new JPanel();
		t1=new JTextField(30);
		add("North",t1);
		add("Center",p1);
		g=new GridLayout(4,4,10,10);
		p1.setLayout(g);
		b1=new JButton[16];
		for(int i=0;i<10;i++)
		{
			b1[i]=new JButton(""+i);
			//String.valueOf(i)
		}
		b1[10]=new JButton(".");
		b1[11]=new JButton("=");
		b1[12]=new JButton("+");
		b1[13]=new JButton("-");
		b1[14]=new JButton("*");
		b1[15]=new JButton("/");
		for(int i=0;i<16;i++)
		{
			p1.add(b1[i]);
		}
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		CalFrame fr=new CalFrame();
	}

}
