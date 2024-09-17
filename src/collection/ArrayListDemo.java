package collection;
import java.util.*;
class Student implements Comparable<Student>
{
	int rollno,marks;
	String name;
	
	public Student(int rollno, int marks, String name) 
	{
		super();
		this.rollno = rollno;
		this.marks = marks;
		this.name = name;
	}

	@Override
	public String toString()
	{
		return "Student [rollno=" + rollno + ", marks=" + marks + ", name=" + name + "]";
	}
	public int compareTo(Student s2)
	{
		if(this.marks>s2.marks)
			return 1;
		else if(this.marks<s2.marks)
			return -1;
		else
			return 0;
	}
}
public class ArrayListDemo 
{
public static void main(String[] args) 
	{
	ArrayList<Student> list=new ArrayList<Student>();
	list.add(new Student(1,60,"jay"));
	list.add(new Student(2,50,"raj"));
	list.add(new Student(3,70,"amit"));
	list.add(new Student(4,40,"bhushan"));
	for(Student s1:list)
	{
		System.out.println(s1);
	}
	Collections.sort(list);
	System.out.println("After Sorting");
	for(Student s1:list)
	{
		System.out.println(s1);
	}
 }

}
