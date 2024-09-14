package Abstract_Interface;
abstract class Demo
{
	int x=10;
	Demo()//default constructor
	{
		
	}
	abstract void show();//abstract method
	public void display()//normal method
	{
		System.out.println("In display method");
	}
}
abstract class ADemo extends Demo
{
 /* @override
	void show()
	{
		
	} */
	abstract void show();//abstract method
}
class BDemo extends Demo
{
	@Override
	void show()
	{
		System.out.println("In show() method");
	}
}
public class AbstractDemo 
{
	public static void main(String[]args)
	{
		Demo d=new BDemo();
		d.display();
		d.show();
	}
}
