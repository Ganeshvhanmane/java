package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class DialogFrame extends JFrame
{
	JButton b1,b2;
	JFrame fr;
	public DialogFrame()
	{
		setLayout(new FlowLayout());
		fr=this;
		b1=new JButton("Message");
		b2=new JButton("Input");
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt)
			{
				JOptionPane.showMessageDialog(fr, "Hello World");
			}
		});
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt)
			{
				String S1=JOptionPane.showInputDialog(fr, "Enter Name");
				JOptionPane.showMessageDialog(fr,"Welcome");
			}
		});
		add(b1);
		add(b2);
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		DialogFrame fr=new DialogFrame();
	}
}
