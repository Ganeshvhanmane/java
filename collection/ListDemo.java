package collection;
import java.util.*;
public class ListDemo 
{
	public static void main(String[] args) 
	{
		List L=new ArrayList();//it uses Dynamic Array
		L.add(10);
		L.add('c');
		L.add("hello");
		L.add(5.6f);
		L.add(10);//allows duplicate elements
		L.add(1234.3433);
		System.out.println(L);
		System.out.println(L.indexOf(5.6f));
		System.out.println(L.lastIndexOf(10));
		System.out.println(L.remove(2));
		System.out.println(L);
		List L1=L.subList(0, 3);
		System.out.println(L1);
		L.clear();
		System.out.println(L);
	}

}
