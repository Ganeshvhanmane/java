package Superdemo;
class Base
{
	//default constructor
	Base()
	{
		System.out.println("default constructor of base class");
	}
}
class Derived extends Base
{
	//default constructor
	Derived()
	{
		//super()    /*to invoke default constructor of parent class ,java implicity calls super keyword*/
		System.out.println("default constructor of derived class");
	}
}
public class Demo 
{
	public static void main(String[]args)
	{
		Derived d=new Derived();
	}
}
