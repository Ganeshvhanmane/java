package Inheritance;
import java.util.Scanner;

//parent class
class Person1
{
	String nm,addr;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter name & address");
		nm=sc.next();
		addr=sc.next();
	}
}
//child class
class Employee1 extends Person1
{
	int id;
	float sal;
	void get2()
	{
		System.out .println("Enter Id & Salary");
		id=sc.nextInt();
		sal=sc.nextFloat();
	}
}
class Role extends Employee1
{
	String role;
	void get3()
	{
		System.out.println("Enter Role of an employee");
		role=sc.next();
	}
	void display()
	{
		System.out.println("Name="+nm+" "+"Id="+id+" "+"Address="+addr+" "+"Salary="+sal+" "+"Role="+role);
	}
}
public class MultiLevel 
{
	public static void main(String[]args)
	{
		Role r=new Role();
		r.get1();
		r.get2();
		r.get3();
		r.display();
	}
}
