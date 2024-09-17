package collection;
import java.util.*;
class Student1 
{
	int rollno,marks;
	String name;
	
	public Student1(int rollno, int marks, String name) 
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
}
class RollNoComparator implements Comparator<Student1>
{
	public int compare(Student1 s1,Student1 s2)
	{
	if(s1.rollno>s2.rollno)
		return 1;
	else if(s1.rollno<s2.rollno)
		return -1;
	else
		return 0;
	}
}
class MarksComparator implements Comparator<Student1>
{
    public int compare(Student1 s1,Student1 s2)
    {
    	if(s1.marks>s2.marks)
    		return 1;
    	else if(s1.marks<s2.marks)
    		return -1;
    	else
    		return 0;
    } 
}
class NameComparator implements Comparator<Student1>
{
    public int compare(Student1 s1,Student1 s2)
    {
    	return s1.name.compareTo(s2.name);
    }
}
public class ArrayListDemo2 
{
	public static void main(String[] args) 
	{
		ArrayList<Student1> list=new ArrayList<Student1>();
		list.add(new Student1(1,60,"jay"));
		list.add(new Student1(2,50,"raj"));
		list.add(new Student1(3,70,"amit"));
		list.add(new Student1(4,40,"bhushan"));
		for(Student1 s1:list)
		{
			System.out.println(s1);
		}
		Collections.sort(list,new RollNoComparator());
		System.out.println("sorting as per rollno");
		for(Student1 s1:list)
		{
			System.out.println(s1);
		}
		Collections.sort(list,new NameComparator());
		System.out.println("sorting as per name");
		for(Student1 s1:list)
		{
			System.out.println(s1);
		}
		Collections.sort(list,new MarksComparator());
		System.out.println("sorting as per marks");
		for(Student1 s1:list)
		{
			System.out.println(s1);
		}
	}

}
