package collection;

import java.util.*;

public class DemoLinkedList 
{
	public static void main(String[] args) 
	{
		List l=new LinkedList();
		l.add(10);
		l.add('h');
		l.add("hello");
		l.add(null);
		l.add(10);
		System.out.println(l);
		System.out.println(l.indexOf('h'));
		System.out.println(l.lastIndexOf(10));
		System.out.println(l.remove(3));
		System.out.println(l);
		List l1=l.subList(0, 2);
		System.out.println(l1);
		l.clear();
		System.out.println(l);
	}

}
