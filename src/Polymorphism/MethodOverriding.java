package Polymorphism;
class Shape
{
	void draw()
	{
		System.out.println("In draw() of shape class");
	}
}
class Circle extends Shape 
{
	void draw()
	{
		System.out.println("In draw() of circle class");
	}
}
class Square extends Shape
{
	void draw()
	{
		System.out.println("In draw() of square class");
	}
}
public class MethodOverriding 
{
	public static void main(String[]args)
	{
	 /* Shape s=new Shape();
		s.draw();
		Circle c=new Circle();
		c.draw();
		Square s1=new Square();
		s1.draw(); */
		
		//dynamic data method dispatch/runtime/dynamic polymorphism
		Shape c=new Circle();
		c.draw();
		Shape s=new Square();
		s.draw();
	}
}
