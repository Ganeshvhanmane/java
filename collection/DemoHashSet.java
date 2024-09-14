package collection;
import java.util.*;
public class DemoHashSet 
{
	public static void main(String[] args) 
	{
		//Set<Integer>S1=new HashSet<>();//unordered collection
		//Set S1=new HashSet();//unordered collection
		Set S1=new LinkedHashSet();//ordered collection
		S1.add(10);
		S1.add(7.8f);
		S1.add("hello");
		S1.add('c');
		S1.add(1234.3433);
		S1.add(null);
		S1.add(10);//duplicate elements not allowed
		System.out.println(S1);
		System.out.println(S1.size());
		System.out.println(S1.isEmpty());
		Object[]o=S1.toArray();
		for (Object i:o)
		{
			System.out.println(i);
		}
		System.out.println(S1.remove(null));
		System.out.println(S1);
		S1.clear();
		System.out.println(S1);
		System.out.println(S1.isEmpty());
	}

}
