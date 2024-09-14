package collection;
import java.util.*;
public class DemoMap
{

	public static void main(String[] args) 
	{
		Map m=new HashMap();
		m.put(5, 'A');
		m.put('c', 23);
		m.put(23.4f, "hello");
		m.put("hi", 34);
		m.put(null, 5);
		m.put(10, null);
		m.put(5, 'd');
		/* a map doesn't allow duplicate keys but you can have duplicate values*/
		m.put(1, 34);
		System.out.println(m);
		System.out.println(m.size());
		System.out.println(m.isEmpty());
		System.out.println(m.get(10));
		System.out.println(m.containsKey("hi"));
		System.out.println(m.containsValue(5));
		Map m1=new HashMap();
		m1.put(7, 's');
		m1.put('x', 27);
		m.putAll(m1);
		System.out.println(m);
		System.out.println(m.remove(null));
		System.out.println(m);
		m.clear();
		System.out.println(m);
		System.out.println(m.isEmpty());
	}

}
