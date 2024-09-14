package statickeyword;
class Demo
{
	//static variable
	static int y=10;
	//static method
	static void show()
	{
		y++;
		System.out .println("y="+y);
	}
}
public class StaticMethod1 
{
	public static void main(String[] args) 
	{
		//if static method is available in another class then it should called as classname.methodname()
		Demo.show();
	    Demo.show();
	}

}
