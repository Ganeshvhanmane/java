package collection;
import java.util.*;
public class GenericWithMap 
{
	public static void main(String[] args) 
	{
		Map<Integer,String> m=new HashMap<Integer,String>();
		m.put(1, "hii");
		m.put(2, "hello");
		m.put(23, "welcome");
		m.put(12, "bye");
		
		Set<Integer> s=m.keySet();
		Iterator<Integer> i=s.iterator();
		while(i.hasNext())
		{
			//System.out.println(i.next());  it prints only key
			int k=i.next();
			String Value=m.get(k);
			System.out.println(k+"="+Value);
		}
	}

}
