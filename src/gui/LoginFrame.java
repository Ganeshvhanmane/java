package gui;
import javax.swing.*;
import java.awt.*;
public class LoginFrame extends JFrame
{
	JLabel l1,l2;
	JTextField t1;
	JPasswordField t2;
	JButton b1,b2;
	public LoginFrame()
	{
		super("Login Page");
		setLayout(null);
		l1=new JLabel("Enter Username");
		l2=new JLabel("Enter Password");
		t1=new JTextField(30);
		t2=new JPasswordField(30);
		b1=new JButton("Login");
		b2=new JButton("Cancel");
		l1.setBounds(100, 100, 140, 40);
		t1.setBounds(260, 100, 140, 40);
		l2.setBounds(100, 160, 140, 40);
		t2.setBounds(260, 160, 140, 40);
		b1.setBounds(120, 220, 90, 40);
		b2.setBounds(260, 220, 90, 40);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		add(b2);
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		LoginFrame fr=new LoginFrame();
	}
}
