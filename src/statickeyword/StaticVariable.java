package statickeyword;
class StaticvDemo
{
	//normal variable
	int x=10;
	//static variable
	static int y=10;
	void show()
	{
		x++;
		y++;
		System.out.println("x="+x+" "+"y="+y);
	}
}
public class StaticVariable 
{
	public static void main(String[]args)
	{
		StaticvDemo s=new StaticvDemo();
		s.show();
		StaticvDemo s1=new StaticvDemo();
		s1.show();
		StaticvDemo s2=new StaticvDemo();
		s2.show();
	}
}
