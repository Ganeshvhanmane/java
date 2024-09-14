package collection;
import java.util.*;
public class DemoTreeSet 
{
	public static void main(String[] args) 
	{
		//Set<Integer> S1=new TreeSet<>();
		SortedSet S1=new TreeSet();
		S1.add(10);
		S1.add(25);
		S1.add(7);
		S1.add(45);
		S1.add(35);
		S1.add(10);//duplicate elements not allowed
		System.out.println(S1);//ascending order
		System.out.println(S1.first());
		System.out.println(S1.last());
		Set S2=new TreeSet();
		S2.add("pune");
		S2.add("mumbai");
		S2.add("goa");
		S2.add("delhi");
		System.out.println(S2);//alphabetical order
		NavigableSet S3=new TreeSet();
		S3.add(3);
		S3.add(9);
		S3.add(25);
		S3.add(75);
		S3.add(45);
		System.out.println(S3);
		System.out.println(S3.floor(20));
		System.out.println(S3.ceiling(35));
	}

}
