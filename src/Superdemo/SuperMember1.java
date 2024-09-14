package Superdemo;
class Base2
{
	int x=10;
	void show()
	{
		System.out.println(this.x);
	}
}
class Derived2 extends Base2
{
	int x=30;
	void show()
	{
		super.show();
		System.out.println(this.x);
	}
}
public class SuperMember1 
{
	public static void main(String[]args)
	{
		Derived2 d=new Derived2();
		d.show();
	}
}
