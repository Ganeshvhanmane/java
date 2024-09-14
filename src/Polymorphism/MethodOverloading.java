package Polymorphism;
class Area
{
	void calarea()
	{
		int r=10;
		System.out.println("area of circle="+(3.14*r*r));
	}
	void calarea(int s)
	{
		System.out.println("area of square="+(s*s));
	}
	float calarea(int b,int h)
	{
		return(0.5f*b*h);
	}
	void calarea(int l,float b)
	{
		System.out.println("area of rectangle="+(l*b));
	}
}
public class MethodOverloading 
{
	public static void main(String[]args)
	{
		Area a=new Area();
		a.calarea();
		a.calarea(5);
		a.calarea(10,5.0f);
		System.out.println("area of triangle="+a.calarea(10,10));
	}
}
