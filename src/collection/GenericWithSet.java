package collection;
import java.util.*;
public class GenericWithSet 
{
	public static void main(String[] args)
	{
		Set<Float> s=new HashSet<Float>();
		s.add(5.6f);
		s.add(7.5f);
		s.add(8.7f);
		s.add(9.0f);
		Iterator<Float>i=s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
