package Abstract_Interface;
interface Demo1
{
	public abstract void show();
}
interface Demo2
{
	public abstract void display();
}
class Demo11 implements Demo1,Demo2
{
	@Override
	public void display()
	{
		System.out.println("In display() method");
	}
	@Override
	public void show()
	{
		System.out.println("In show() method");
	}
}
public class InterfaceDemo 
{
	public static void main(String[]args)
	{
		Demo1 d=new Demo11();
		d.show();
		Demo2 d1=new Demo11();
		d1.display();
	}
}
