package Superdemo;
class Person
{
	int id;
	String name;
	//parameterized constructor
	public Person(int id,String name)
	{
		super();
		this.id=id;
		this.name=name;
	}
}
class Employee extends Person
{
	float salary;
	public Employee(int id,String name,float salary)
	{
		super(id,name);
		this.salary=salary;
	}
	public void display()
	{
		System.out.println("name="+name+" "+"id="+id+" "+"salary="+salary);
	}
}
public class Demo1 
{
	public static void main(String[]args)
	{
		Employee e=new Employee(101,"ram",50000.00f);
		e.display();
	}
}
