package statickeyword;

public class StaticMethod 
{
	//static variable
	static int y=10;
	//static method
	static void show()
	{
		y++;
		System.out.println("y="+y);
	}
	public static void main(String[]args)
	{
		//you can call static method without object creation
		//if it is in same class then we can directly call it by method name
		show();
		show();
	}
}
