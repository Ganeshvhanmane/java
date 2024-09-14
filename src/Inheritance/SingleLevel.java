package Inheritance;
import java.util.Scanner;
//parent class
class person
{
	String nm,addr;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter Name and Address");
		nm=sc.next();
		addr=sc.next();
	}
}
//child class
class Employee extends person
{
	int id;
	float sal;
	void get2()
	{
	    System.out.println("Enter id and salary");
		id=sc.nextInt();
		sal=sc.nextFloat();
	}
	void display()
	{
		System.out.println("Id="+id+" "+"Name="+nm+" "+"Address="+addr+" "+"Salary="+sal);
	}
}
	public class SingleLevel 
{
 public static void main (String[]args)
 {
	 Employee e=new Employee();
	 e.get1();
	 e.get2();
	 e.display();
  }
}
