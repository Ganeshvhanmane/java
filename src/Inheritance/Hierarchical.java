package Inheritance;
//parent class
class Vehicle
{
	double baseprice=100000;
	public void showprice()
	{
		System.out.println("price of any vehicle="+baseprice);
	}
}
//child class
class TwoWheelar extends Vehicle
{
	double increasepriceBy=0.20;
	public void finalprice()
	{
		baseprice=baseprice+(baseprice*increasepriceBy);
		System.out.println("final price of bike="+baseprice);
	}
}
//child class
class FourWheelar extends Vehicle
{
	double increasepriceBy=1;
	public void finalprice()
	{
		baseprice=baseprice+(baseprice*increasepriceBy);
		System.out.println("final price of car="+baseprice);
	}
}
public class Hierarchical 
{
	public static void main(String[]args)
	{
		TwoWheelar t=new TwoWheelar();
		t.showprice();
		t.finalprice();
		FourWheelar f=new FourWheelar();
		f.showprice();
		f.finalprice();
	}
}
