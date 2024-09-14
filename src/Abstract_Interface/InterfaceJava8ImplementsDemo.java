package Abstract_Interface;
/*from Java 8th version we can provide defination for static 
 * and default member function inside the interface*/
interface Demo3
{
	final int i=10;
	static String City ="Pune";
	static void show()
	{
		System.out.println("In show method");
	}
	default void display()
	{
		System.out.println("In display()method");
	}
}
class InterfaceJava8 implements Demo3 
{
	
}
public class InterfaceJava8ImplementsDemo 
{
	public static void main(String[] args) 
	{
		Demo3 d = new InterfaceJava8();
		d.display();
		// as static method can be called directly without object creation
		Demo3.show();
		//accessing data member
		System.out.println(Demo3.City);
		System.out.println(Demo3.i);
	}
}
