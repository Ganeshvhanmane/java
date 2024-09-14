package Superdemo;
class Base3
{
	//default constructor
	Base3()
	{
	System.out.println("default constructor of base class");
	}
	//parameterized constructor
	Base3(int x)
	{
		System.out.println("parameterized constructor of base class");
	}
}
class Derived3 extends Base3
{
	//default constructor
	Derived3()
	{
		System.out.println("default constructor of derived class");
	}
	//parameterized constructor
	Derived3(int y)
	{
		super(5);
		System.out.println("parameterized constructor of derived class");
	}
}
public class SuperParameter 
{
	public static void main(String[]args)
	{
		Derived3 d=new Derived3();
		Derived3 d1=new Derived3(10);
	}
}
