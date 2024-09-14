package Polymorphism;
class Shape1
{
	Shape1 draw()
	{
		System.out.println("In draw() of shape1 class");
		return new Shape1();
	}
}
class Circle1 extends Shape1
{
	Circle1 draw()
	{
		System.out.println("In draw() of circle class");
		return new Circle1();
	}
}
public class CovariantReturnType 
{
	public static void main(String[]args)
	{
		Shape1 c=new Circle1();
		c.draw();
	}
}
