package collection;
import java.util.*;
public class GenericWithList 
{
	public static void main(String[] args) 
	{
		List<String> l=new ArrayList<String>();
		l.add("pune");
		l.add("mumbai");
		l.add("delhi");
		l.add("goa");
		ListIterator<String> li=l.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("----------------------------");
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
	}

}
