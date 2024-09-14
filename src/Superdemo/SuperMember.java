package Superdemo;
class Base1
{
	//data member
	int x=10;
}
class Derived1 extends Base1
{
	//data member
	int x=40;
	void show()
	{
		System.out.println(super.x);
		System.out.println(this.x);
	}
}
public class SuperMember 
{
	public static void main(String[]args)
	{
		Derived1 d=new Derived1();
		d.show();
	}
}
